SUMMARY = "Qt 6 SensorsQuick library"
DESCRIPTION = "The Qt6 SensorsQuick library."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "libQt6SensorsQuick6-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "bfef0e4b2139e910ddc041743a5de616c701de7f204d02d1bb5d06197f76c776144847cfe02d098afe802e5be9cb17d6de7be78ed28924399b7bff8d8b47a0a5"

RPROVIDES:${PN} += "libQt6SensorsQuick.so.6 \
libQt6SensorsQuick6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Qml.so.6 \
libQt6Sensors.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
