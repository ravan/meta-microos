SUMMARY = "Examples for the qt6-websockets modules"
DESCRIPTION = "Examples for the qt6-websockets modules."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-websockets-examples-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "559e49f987f1eeba1be53ee2cd66881318f28c45d0748ca7f702927d339ba25ba6478df4d694a65486d6fa3cd0c6d2f2f91a1aa95c8b1d5eb2ff936893a1402b"

RPROVIDES:${PN} += "qt6-websockets-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Quick.so.6 \
libQt6WebSockets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
qt6qmlimport-QtQuick \
qt6qmlimport-QtWebSockets"

inherit rpm
