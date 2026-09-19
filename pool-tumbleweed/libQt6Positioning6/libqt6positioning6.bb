SUMMARY = "Qt 6 Positioning library"
DESCRIPTION = "The Qt 6 Positioning library."
LICENSE = "GPL-3.0-or-later"

PV = "6.11.2"

RPM_NAME = "libQt6Positioning6-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "f901cdde8e5462e5138d2229c697971828a72ec490662fe2d15dd8db1b0469b25ff3ce32c565fb97417f146744c521e4c11661cf9dc012dd05cf4979c413c248"

RPROVIDES:${PN} += "libQt6Positioning.so.6 \
libQt6Positioning6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
