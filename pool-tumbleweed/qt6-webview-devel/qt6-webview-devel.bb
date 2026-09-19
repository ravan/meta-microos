SUMMARY = "Qt 6 WebView library - Development files"
DESCRIPTION = "Development files for the Qt 6 WebView library"
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-webview-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "7f3a3d287b16a67937b3012f3bccb040e72fad00ca0c19d4d577d7dbacf8ca7ff2a6895607eec22bca75cf1a4f691e8981c6186b03eeffb552a094df070965e9"

RPROVIDES:${PN} += "cmake-Qt6WebView \
pkgconfig-Qt6WebView \
qt6-webview-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Gui \
libQt6WebView6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui"

inherit rpm
