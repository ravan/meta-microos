#
# The packages that make up a minimal, bootable MicroOS image.
#
# Every name is an openSUSE binary package, spelled the way openSUSE spells it.
# Two things read this file:
#
#   recipes-core/images/microos-image.bb   turns it into IMAGE_INSTALL
#   scripts/microos-sysroot                follows RDEPENDS through the pool
#                                          until the set closes, and links the
#                                          result into recipes-image/
#
# Keeping one list means a package cannot be installed without its recipe being
# linked, which BitBake would otherwise report as a missing provider somewhere
# unrelated.
#
# It is a BitBake include and not a plain text file so that BitBake knows the
# image recipe depends on it. A recipe that reads a plain file at parse time
# keeps its cached answer when that file changes, and the build silently uses
# the old list.
#
# The groups below are, in order: the filesystem itself, the C library and
# compiler runtime, the shell and core tools, init, users and login, and the
# kernel.
#
# shadow-pw-mgmt is here for a reason worth keeping. The shadow RPM requires
# "(account-utils or shadow-pw-mgmt = 4.20.2)", and scripts/microos drops
# boolean dependencies when it generates recipes, so the BitBake graph never
# shows this one. Only dnf, which reads the real RPM metadata, asks for it.
# shadow-pw-mgmt is shadow's own sub-package and carries passwd and chage;
# account-utils is the newer varlink service and brings a daemon with it.
#

MICROOS_IMAGE_PACKAGES = "\
    filesystem \
    system-user-root \
    aaa_base \
    MicroOS-release \
    \
    glibc \
    glibc-locale-base \
    libgcc_s1 \
    \
    bash \
    bash-sh \
    coreutils \
    gawk \
    sed \
    grep \
    findutils \
    util-linux \
    procps \
    less \
    \
    systemd \
    systemd-presets-branding-MicroOS \
    systemd-default-settings-branding-openSUSE \
    udev \
    dbus-broker \
    kmod \
    suse-module-tools \
    \
    shadow \
    shadow-pw-mgmt \
    pam \
    pam-config \
    terminfo-base \
    \
    kernel-default \
"
