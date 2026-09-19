SUMMARY = "Qt 6 Sensors library"
DESCRIPTION = "The Qt 6 Sensors library."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "libQt6Sensors6-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "4a93a92f3094a8c2f97293572087c2b7e4b6a3587ed72155e281cbbe51d48ec70dfa0ba2ad591d3b55cd4aabc8a47081869f07f6153d20d2c1e5fd2163b58dea"

RPROVIDES:${PN} += "libQt6Sensors.so.6 \
libQt6Sensors6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libc.so.6 \
libstdc++.so.6 \
qt6-sensors"

inherit rpm
