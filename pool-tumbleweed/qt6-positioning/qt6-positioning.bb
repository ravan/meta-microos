SUMMARY = "Qt 6 Positioning plugins and libraries"
DESCRIPTION = "The Qt Positioning API provides positioning information via QML and C++ interfaces."
LICENSE = "GPL-3.0-or-later"

PV = "6.11.2"

RPM_NAME = "qt6-positioning-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "38908e8f16b118209394026f1fab9451030b3f1dcb2de20ebe7668e861c15f5f7893b776fce2034dc7c5abcf654d2b1ef658ba94a072c100e27d287cf495da7f"

RPROVIDES:${PN} += "libqtposition-geoclue2.so \
libqtposition-nmea.so \
libqtposition-positionpoll.so \
qt6-location \
qt6-positioning"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Network.so.6 \
libQt6Positioning.so.6 \
libQt6SerialPort.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
