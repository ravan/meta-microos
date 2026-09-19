SUMMARY = "Qt 6 WebView library"
DESCRIPTION = "Qt WebView lets you display web content inside a QML application. To avoid \
including a full web browser stack, Qt WebView uses native APIs where \
appropriate."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-webview-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "4f6bccb1d3a19b1380d74f6a5a3725ba870931a86342cf5d0caad1d4e7225d7119cd5430f206658dc607424c7e64964521d9ff3da0beee84f960a4d73ac19341"

RPROVIDES:${PN} += "libqtwebview-webengine.so \
qt6-webview"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6WebEngineCore.so.6 \
libQt6WebEngineQuick.so.6 \
libQt6WebView.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
