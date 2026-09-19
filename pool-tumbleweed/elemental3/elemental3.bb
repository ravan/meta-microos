SUMMARY = "Elemental 3"
DESCRIPTION = "Elemental3 is a tool for managing machines using cloud-native \
technologies."
LICENSE = "Apache-2.0"

PV = "3.0.3"

RPM_NAME = "elemental3-3.0.3-1.1.aarch64.rpm"
RPM_HASH = "bbf134f0b05b9fe3e138e0e4491034f1a36652e612907a6bf05a5e10f69d3aa3c6e7fa6e73b060e43d22dfdafde0b17cdb51ad98f5e498aaf89db16bd169278a"

RPROVIDES:${PN} += "elemental3"

RDEPENDS:${PN} += "btrfsmaintenance \
btrfsprogs \
dosfstools \
e2fsprogs \
gptfdisk \
grub2-common \
libc.so.6 \
lvm2 \
mtools \
rsync \
snapper \
udev \
util-linux-systemd \
xorriso"

inherit rpm
