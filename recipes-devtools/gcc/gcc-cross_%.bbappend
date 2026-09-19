# gcc-cross normally builds against headers Yocto produced itself. Here it builds
# against the MicroOS sysroot, so the openSUSE devel RPMs have to be staged into
# its recipe sysroot before do_configure runs.
#
# MICROOS_SYSROOT_DEPENDS is set by conf/distro/include/tcmode-microos-sysroot.inc
# and is empty everywhere else, so this append is inert in other distros.
MICROOS_SYSROOT_DEPENDS ?= ""
DEPENDS += "${MICROOS_SYSROOT_DEPENDS}"
