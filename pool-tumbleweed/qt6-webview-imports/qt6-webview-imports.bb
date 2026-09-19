SUMMARY = "Qt 6 WebView QML files and plugins"
DESCRIPTION = "QML files and plugins from the Qt 6 WebView module"
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-webview-imports-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "4e05e7b2f0f327fbdeda24829f936d623bd541ac2763f50b45d3e7ceebded244624f9ce715de6e1898c2d98f59ed6a88b74b11311cd14ecb6d4117c430b25fe2"

RPROVIDES:${PN} += "libqtwebviewquickplugin.so \
qt6-webview-imports \
qt6qmlimport-QtWebView \
qt6qmlimport-QtWebView.1 \
qt6qmlimport-QtWebView.2 \
qt6qmlimport-QtWebView.6"

RDEPENDS:${PN} += "libQt6Core.so.6 \
libQt6Qml.so.6 \
libQt6WebViewQuick.so.6 \
libc.so.6 \
libstdc++.so.6 \
qt6qmlimport-QtQuick \
qt6qmlimport-QtWebEngine"

inherit rpm
