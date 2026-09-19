SUMMARY = "Windows USB installation media creator"
DESCRIPTION = "WoeUSB is a utility for creating a bootable Windows installation \
USB storage device from an existing Windows installation disc or disk image."
LICENSE = "GPL-3.0-or-later"

PV = "5.2.4"

RPM_NAME = "WoeUSB-5.2.4-1.14.noarch.rpm"
RPM_HASH = "14089e7c6bda1f2e6584e397eb21a4d64a62f22099a2d97b72f145be11fea9d9689e7b7c514c2b484c70b8b9db2e06344160dc0f3e85eb0fba8f170ccc6e5a1d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "WoeUSB"

RDEPENDS:${PN} += "/usr/bin/bash \
bash \
dosfstools \
findutils \
gawk \
grep \
grub2 \
ntfsprogs \
parted \
util-linux \
wget \
wimtools"

inherit rpm
