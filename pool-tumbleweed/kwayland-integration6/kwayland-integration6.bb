SUMMARY = "Plugin to integrate KF5 KWayland into Plasma 6"
DESCRIPTION = "Plugin to integrate KF5 KWayland into Plasma 6."
LICENSE = "LGPL-2.1-or-later"

PV = "6.7.5"

RPM_NAME = "kwayland-integration6-6.7.5-1.1.aarch64.rpm"
RPM_HASH = "3b1f2dfda7582468ba36d25174f2ea055586857d284e548e9a668a37c8487178bf23693f504c0e55888233b7eeedd9c62a820b9965a72a0b8b2979dcd62c4356"

RPROVIDES:${PN} += "kwayland-integration6"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5WaylandClient.so.5 \
libKF5WindowSystem.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5WaylandClient.so.5 \
libc.so.6 \
libstdc++.so.6 \
libwayland-client.so.0"

inherit rpm
