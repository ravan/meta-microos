SUMMARY = "Qt 6 OpcUa Client Library"
DESCRIPTION = "Qt 6 OpcUa Client Library."
LICENSE = "(GPL-2.0-or-later | LGPL-3.0-only) & GPL-3.0-or-later"

PV = "6.11.2"

RPM_NAME = "libQt6OpcUa6-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "7e146863327dfa379d19c71e6442768daa3388f35f0ac931a474b1e653f4e2805ac5cbda40cca3842fd82a216568385511c5023e6ce974043dd4336563391b52"

RPROVIDES:${PN} += "libQt6OpcUa.so.6 \
libQt6OpcUa6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Network.so.6 \
libc.so.6 \
libcrypto.so.3 \
libstdc++.so.6"

inherit rpm
