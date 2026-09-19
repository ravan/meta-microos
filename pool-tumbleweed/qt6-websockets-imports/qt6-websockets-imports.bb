SUMMARY = "Qt 6 WebSockets QML files and plugins"
DESCRIPTION = "QML files and plugins from the Qt 6 WebSockets module"
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-websockets-imports-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "06c2ada05a80f9dc93cd2b65a2757f14ae189e6119595acc24f814cfc9e130bfce69bcacc96bc764207a418e0a511f89cbbbdf2cdfbc8fe43cca7d4ec727af5b"

RPROVIDES:${PN} += "libqmlwebsocketsplugin.so \
qt6-websockets-imports \
qt6qmlimport-QtWebSockets \
qt6qmlimport-QtWebSockets.1 \
qt6qmlimport-QtWebSockets.6"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Network.so.6 \
libQt6Qml.so.6 \
libQt6WebSockets.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
