SUMMARY = "Qt 6 WebViewQuick library - Development files"
DESCRIPTION = "Development files for the Qt 6 WebViewQuick library."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-webviewquick-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "3a7569787c6a5c2ecf6bbb96fcdf8957d84283ae2c4b3f79064dc58f464ea86cfe2b7c73ec6f6cb94c4eb00d11af04c3c3f5391f21e82b0a9912be2ab6377bcc"

RPROVIDES:${PN} += "cmake-Qt6WebViewQuick \
pkgconfig-Qt6WebViewQuick \
qt6-webviewquick-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6OpenGL \
cmake-Qt6QmlModels \
cmake-Qt6Quick \
cmake-Qt6WebView \
libQt6WebViewQuick6 \
pkgconfig-Qt6OpenGL \
pkgconfig-Qt6QmlModels \
pkgconfig-Qt6Quick"

inherit rpm
