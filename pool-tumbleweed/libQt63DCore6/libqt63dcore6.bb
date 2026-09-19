SUMMARY = "Qt 6 3DCore library"
DESCRIPTION = "The Qt 6 3DCore library."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "libQt63DCore6-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "8671a2175d796b4087dd5d2556561db18f2dcbb2ce899d061b8760d960ab90a1de7f051d51e400b248532e29b30167151a9c8c6d581a7dc5c0dc2c53ebfea4ae"

RPROVIDES:${PN} += "libQt63DCore.so.6 \
libQt63DCore6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Concurrent.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
