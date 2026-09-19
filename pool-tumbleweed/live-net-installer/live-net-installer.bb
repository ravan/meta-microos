SUMMARY = "Makes the installation available from a running system"
DESCRIPTION = "This package contains files that allow starting the installer from a \
running (live) system."
LICENSE = "BSD-3-Clause"

PV = "1.0"

RPM_NAME = "live-net-installer-1.0-22.2.aarch64.rpm"
RPM_HASH = "1c4ddde3107a452bd4d4613f326d61f15197acd7450dedf3e595973ad07898eaf87ffad7592db70cd3a1f9649b8a9b9fc04a57f60da04b6b3f68b2ab73f0ef39"

RPROVIDES:${PN} += "live-net-installer"

RDEPENDS:${PN} += "/usr/bin/bash \
bcache-tools \
btrfsprogs \
cryptsetup \
device-mapper \
e2fsprogs \
exfatprogs \
fcoe-utils \
mdadm \
multipath-tools \
ntfs-3g \
ntfsprogs \
nvme-cli \
open-iscsi \
quota \
snapper \
util-linux \
xdg-utils \
xfsprogs \
yast2-installation"

inherit rpm
