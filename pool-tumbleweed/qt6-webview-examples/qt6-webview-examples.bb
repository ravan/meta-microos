SUMMARY = "Examples for the qt6-webview modules"
DESCRIPTION = "Examples for the qt6-webview modules."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-webview-examples-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "af26787be93f297feb51abb5496678a825f7f7a8929032665543998f06f67fba40155cb5aaea2cd11f2b8b8ae5f80ee0bf3c3f99c6562ca697e7ad172534e1d8"

RPROVIDES:${PN} += "qt6-webview-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6WebView.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
qt6qmlimport-QtQuick \
qt6qmlimport-QtQuick.Controls \
qt6qmlimport-QtQuick.Layouts \
qt6qmlimport-QtWebView"

inherit rpm
