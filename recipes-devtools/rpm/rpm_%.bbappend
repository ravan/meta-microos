# Write the RPM database in the format the image's own rpm can read.
#
# poky's rpm defaults to the sqlite backend, so dnf builds the image's database
# as rpmdb.sqlite. openSUSE's rpm is built with ndb as its default and looks for
# Packages.db and Index.db. The two never meet: the image boots, and "rpm -qa"
# inside it answers zero, because it is reading a database format it does not
# open. Moving the database to /usr/lib/sysimage/rpm, which the image class also
# does, was necessary and was not sufficient - the path was right and the file
# was still unreadable.
#
# rpm reads ${libdir}/rpm/macros before anything else, so one line at the end of
# it changes the default for rpm-native and for the librpm that dnf-native
# loads, which are the only two things that write this database.
#
# Leave MICROOS_RPM_DB_BACKEND empty to keep poky's default.
MICROOS_RPM_DB_BACKEND ?= ""

do_install:append:class-native() {
    if [ -n "${MICROOS_RPM_DB_BACKEND}" ]; then
        if ! grep -q "^%_db_backend" ${D}${libdir}/rpm/macros; then
            bbfatal "rpm-native's macros file no longer defines %_db_backend. Check this bbappend against poky's rpm recipe."
        fi
        echo "%_db_backend ${MICROOS_RPM_DB_BACKEND}" >> ${D}${libdir}/rpm/macros
    fi
}

# Give the scriptlets the image's own PATH back.
#
# Upstream rpm sets PATH from %_install_script_path - "/sbin:/bin:/usr/sbin:
# /usr/bin" - right before it runs a scriptlet. poky carries
# 0001-Do-not-reset-the-PATH-environment-variable-before-ru.patch, which
# comments that line out, because a poky scriptlet runs on the build host and
# needs the native tools that poky puts on PATH.
#
# Here the scriptlet runs inside a real chroot into the image, where not one
# directory of the build task's PATH exists. Every scriptlet therefore said
# "touch: command not found", and so did the ones that run at the very end of
# the transaction, when coreutils had long been unpacked - which is how it was
# clear that this was PATH and not the install order.
#
# Dropping the patch restores upstream rpm's behaviour for rpm-native, which is
# the rpm that dnf loads and the only one that installs anything here.
#
# Only when the scriptlets are going to run. With MICROOS_RPM_SCRIPTLETS = "0"
# poky's rpm is left exactly as it was.
#
# The same switch also adds a patch of our own. poky's dnf wrapper exports
# RPM_CONFIGDIR and RPM_ETCCONFIGDIR at the native sysroot, rpm hands its whole
# environment to a scriptlet, and upstream rpm reads both. Inside the chroot
# neither path exists, so every scriptlet that calls the image's own rpm - and
# "permctl --set", which applies the permissions package's setuid and setgid
# rules, is one of them - failed with "Cannot determine package ownership".
# The patch drops the two variables in the scriptlet child only.
MICROOS_RPM_SCRIPTLETS ?= "auto"

MICROOS_RPM_PATH_PATCH = "file://0001-Do-not-reset-the-PATH-environment-variable-before-ru.patch"

FILESEXTRAPATHS:prepend := "${THISDIR}/files:"
MICROOS_RPM_SCRIPTLET_ENV_PATCH = "file://0001-microos-do-not-hand-the-native-rpm-config-path-to-a-.patch"

python () {
    if d.getVar("MICROOS_RPM_SCRIPTLETS") == "0":
        return

    patch = d.getVar("MICROOS_RPM_PATH_PATCH")
    src = d.getVar("SRC_URI")
    if patch not in src:
        bb.fatal("poky's rpm recipe no longer applies %s, so the scriptlet "
                 "PATH may already be upstream's. Check this bbappend against "
                 "poky's rpm recipe." % patch)
    d.setVar("SRC_URI", src.replace(patch, ""))
    d.appendVar("SRC_URI", " " + d.getVar("MICROOS_RPM_SCRIPTLET_ENV_PATCH"))
}
