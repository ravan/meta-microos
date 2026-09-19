SUMMARY = "User and system idle time reporting singleton"
DESCRIPTION = "KIdleTime is a singleton reporting information on idle time. It is useful not \
only for finding out about the current idle time of the PC, but also for getting \
notified upon idle time events, such as custom timeouts, or user activity."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-kidletime-plugins-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "0ea2a4a04d4d6fe756a966b0f13dde7b1dfa413a72cd50360818733dcbd39267b12a79f99fe732f8b16279d7a78efbf2edb038f671be526771e4eb5ad5adc263"

RPROVIDES:${PN} += "kf6-kidletime-plugins"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6IdleTime.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6WaylandClient.so.6 \
libX11-xcb.so.1 \
libX11.so.6 \
libXext.so.6 \
libXss.so.1 \
libc.so.6 \
libstdc++.so.6 \
libwayland-client.so.0 \
libxcb-sync.so.1 \
libxcb.so.1"

inherit rpm
