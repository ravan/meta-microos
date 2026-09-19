SUMMARY = "FCoE userspace management tools"
DESCRIPTION = "Userspace tools to manage FibreChannel over Ethernet (FCoE) \
connections."
LICENSE = "GPL-2.0-only"

PV = "1.0.34+9.3d27180c86c"

RPM_NAME = "fcoe-utils-1.0.34+9.3d27180c86c-1.3.aarch64.rpm"
RPM_HASH = "7be60ad9d3ca58af762a5e49398825b61bb9ce07691cc36fed27b0131ebf1263b7410c5683b7f7616e63d8d6dcff52c0d5673438e0b9722036dea48363f59bf6"

RPROVIDES:${PN} += "fcoe-utils"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
device-mapper \
fillup \
iproute \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpciaccess.so.0 \
open-lldp \
pkgconfig-systemd \
systemd"

inherit rpm
