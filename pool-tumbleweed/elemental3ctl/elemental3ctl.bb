SUMMARY = "Elemental 3 control client"
DESCRIPTION = "Elemental3ctl is a tool for managing machines using cloud-native \
technologies."
LICENSE = "Apache-2.0"

PV = "3.0.3"

RPM_NAME = "elemental3ctl-3.0.3-1.1.aarch64.rpm"
RPM_HASH = "5b96e1ae7cc04e8fdb765ae36cea829c9bc772fd365a9f14da060c3491e7bd5e08f777c0304a14b9c4e807ccbf1caf005ba3062661e93923633117bde516b768"

RPROVIDES:${PN} += "elemental3-toolkit \
elemental3ctl"

RDEPENDS:${PN} += "btrfsprogs \
coreutils \
crypto-policies-scripts \
dosfstools \
e2fsprogs \
efibootmgr \
grub2-common \
libc.so.6 \
mtools \
policycoreutils \
rsync \
snapper \
squashfs \
udev \
util-linux \
util-linux-systemd \
xorriso"

inherit rpm
