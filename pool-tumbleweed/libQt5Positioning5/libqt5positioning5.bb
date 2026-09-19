SUMMARY = "Qt 5 Positioning Library"
DESCRIPTION = "The Qt Positioning API gives developers the ability to determine a \
position by using a variety of possible sources, including satellite, \
WiFi, text file, and so on. That information can then be used to, for \
example, determine a position on a map. In addition, satellite \
information can be retrieved and area-based monitoring be performed."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.19+kde7"

RPM_NAME = "libQt5Positioning5-5.15.19+kde7-1.2.aarch64.rpm"
RPM_HASH = "283c5b9d8256c41a58faad407b7546a0ed70babecc57189c9a152eb2bd71d3ce4da881dc2e80adb41ba6c202f2f710c9b7b0b77c31847bed97eb429cdc8f543e"

RPROVIDES:${PN} += "libQt5Positioning.so.5 \
libQt5Positioning5 \
libqtposition-geoclue.so \
libqtposition-geoclue2.so \
libqtposition-positionpoll.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
