SUMMARY = "Configuration file access"
DESCRIPTION = "KConfig provides an advanced configuration system. It is made of two parts: \
KConfigCore and KConfigGui. \
 \
This package contains the kconf_update tool."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "5.116.0"

RPM_NAME = "kconf_update5-5.116.0-2.8.aarch64.rpm"
RPM_HASH = "c1917867ba7a681a34e841bcfedc65eeaf855cf98625e6f83b8f6bb63de1f73967810b33752e0f1082ba730c9a73587bc3725733cfb32160463a92d037385d33"

RPROVIDES:${PN} += "kconf-update5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigCore5 \
libQt5Core.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
