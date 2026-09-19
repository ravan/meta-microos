SUMMARY = "QML imports for the Qt 5 WebSockets library"
DESCRIPTION = "The Qt WebSockets module provides C++ and QML interfaces that enable \
Qt applications to act as a server that can process WebSocket \
requests, or a client that can consume data received from the server, \
or both."
LICENSE = "LGPL-3.0-only |  (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.19+kde2"

RPM_NAME = "libQt5WebSockets5-imports-5.15.19+kde2-1.2.aarch64.rpm"
RPM_HASH = "fc7f4cd73cfd027e08efe7ce90003c270f0fb0a2a00a375420dd7dc5ce59a2722f33d06a10a3351d39d0697e69c614d26c5f7f8d10a4e5fd6a3b5a15446e5c7d"

RPROVIDES:${PN} += "libQt5WebSockets5-imports \
libdeclarative-qmlwebsockets.so \
qt5qmlimport-Qt.WebSockets.1 \
qt5qmlimport-QtWebSockets.1"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Network.so.5 \
libQt5Qml.so.5 \
libQt5WebSockets.so.5 \
libQtQuick5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
