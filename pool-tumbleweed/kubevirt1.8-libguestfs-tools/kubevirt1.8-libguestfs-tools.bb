SUMMARY = "Contents of the libguestfs-tools container"
DESCRIPTION = "The libguestfs-tools package provides the entrypoint script and the \
runtime dependency closure of the libguestfs-tools container image \
used by virtctl guestfs."
LICENSE = "Apache-2.0"

PV = "1.8.4"

RPM_NAME = "kubevirt1.8-libguestfs-tools-1.8.4-5.1.aarch64.rpm"
RPM_HASH = "f3bf6915cc3a6af34410989e16a7e7bf42341f135f624a842b24c64b3ca75e454fb778dfcef1bb75c16f3b00428320a9c9d613df4c2ff0a807b5aaff15b58ac3"

RPROVIDES:${PN} += "kubevirt-1.8-libguestfs-tools \
kubevirt-libguestfs-tools \
kubevirt1.8-libguestfs-tools"

RDEPENDS:${PN} += "/usr/bin/bash \
btrfsprogs \
cryptsetup \
dosfstools \
e2fsprogs \
gptfdisk \
guestfs-tools \
jfsutils \
ldmtool \
libguestfs \
libguestfs-appliance \
libguestfs-winsupport \
mdadm \
parted \
qemu-arm \
qemu-tools \
qemu-uefi-aarch64 \
qemu-x86 \
supermin \
xfsprogs \
xorriso"

inherit rpm
