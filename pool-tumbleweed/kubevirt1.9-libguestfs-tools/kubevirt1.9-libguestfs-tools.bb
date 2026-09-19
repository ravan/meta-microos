SUMMARY = "Contents of the libguestfs-tools container"
DESCRIPTION = "The libguestfs-tools package provides the entrypoint script and the \
runtime dependency closure of the libguestfs-tools container image \
used by virtctl guestfs."
LICENSE = "Apache-2.0"

PV = "1.9.0"

RPM_NAME = "kubevirt1.9-libguestfs-tools-1.9.0-3.1.aarch64.rpm"
RPM_HASH = "54f356ccf66ef30ed374fb8fcde2c8970cf02c881d90792580cebf5824a6585431b49be62988372715727607ba3390b8f913eae596cc2128515e0c0706ebb913"

RPROVIDES:${PN} += "kubevirt-libguestfs-tools \
kubevirt1.9-libguestfs-tools"

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
