# gcc-cross normally builds against headers Yocto produced itself. Here it builds
# against the MicroOS sysroot, so the openSUSE devel RPMs have to be staged into
# its recipe sysroot before do_configure runs.
#
# MICROOS_SYSROOT_DEPENDS is set by conf/distro/include/tcmode-microos-sysroot.inc
# and is empty everywhere else, so this append is inert in other distros.
MICROOS_SYSROOT_DEPENDS ?= ""
DEPENDS += "${MICROOS_SYSROOT_DEPENDS}"

# Point the built-in loader path at the place openSUSE keeps the loader.
#
# cross.bbclass sets target_base_libdir = "${target_base_prefix}/${baselib}",
# and a class assignment beats anything a conf file says, so the value has to be
# put back after parsing. gcc-configure-common.inc then builds SYSTEMLIBS, and
# therefore GLIBC_DYNAMIC_LINKER, out of it.
#
# MICROOS_LOADER_BASELIB is set by conf/distro/include/tcmode-microos-sysroot.inc
# and explained there. It is unset in every other distro, so this does nothing.
python () {
    baselib = d.getVar("MICROOS_LOADER_BASELIB")
    if baselib:
        d.setVar("target_base_libdir", "${target_base_prefix}/" + baselib)
}
