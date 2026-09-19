SUMMARY = "Library for accessing AKAI disk images"
DESCRIPTION = "C++ library for accessing AKAI disk images"
LICENSE = "GPL-2.0-or-later"

PV = "4.6.0"

RPM_NAME = "libakai0-4.6.0-1.1.aarch64.rpm"
RPM_HASH = "cf5fcd24ddd6472bb79b412f81244ff14cb9a493c882b9f96ba4f04c114277f1b4430950c37b09fa961f96a07e5d3ff9bcac2dd2131a74a1fe3ddbdefbe977ea"

RPROVIDES:${PN} += "config-libakai0 \
libakai.so.0 \
libakai0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
