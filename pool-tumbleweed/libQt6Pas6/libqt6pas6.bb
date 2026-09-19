SUMMARY = "Free Pascal interface to Qt6"
DESCRIPTION = "Qt5 bindings for Pascal from Lazarus."
LICENSE = "LGPL-3.0-only"

PV = "4.8"

RPM_NAME = "libQt6Pas6-4.8-1.2.aarch64.rpm"
RPM_HASH = "36040fcb29826d179ac28aad0d01b85abf0e5f79fa2480d02deb69cf045b2204f832668b23f4bf5da02e8691615b42d2391cdb889a00cdf1073a8f801ef8442b"

RPROVIDES:${PN} += "libQt6Pas.so.6 \
libQt6Pas6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6PrintSupport.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
