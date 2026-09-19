SUMMARY = "NetworkManager plugin for ADSL connections"
DESCRIPTION = "NetworkManager plugin for ADSL connections. \
 \
This package is needed to configure PPPoE interfaces"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.56.1"

RPM_NAME = "NetworkManager-pppoe-1.56.1-4.1.aarch64.rpm"
RPM_HASH = "2f269aab39024c3fd85bb8715cd3e6b18e693d4cc4bf36a4509558d80ed62c53a6b1075fe4865ef640288ac40b2bdca87d0d4ba650eb4cb5a332ed16cfd96d4e"

RPROVIDES:${PN} += "NetworkManager-pppoe \
libnm-device-plugin-adsl.so \
libnm-ppp-plugin.so"

RDEPENDS:${PN} += "NetworkManager \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
ppp \
rp-pppoe"

inherit rpm
