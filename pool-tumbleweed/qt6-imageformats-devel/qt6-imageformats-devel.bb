SUMMARY = "Qt 6 ImageFormats - Development files"
DESCRIPTION = "Development files for the Qt 6 ImageFormats plugins."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-imageformats-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "ccdca726d8f79977858672e82b3838ad6c08eca80aa5f50754c8b277277744772329c80b6fe3dceaf36adda728a42eda23ff21e8c20d6d6b0257461336ea1ad3"

RPROVIDES:${PN} += "cmake-Qt6QICNSPlugin \
cmake-Qt6QJp2Plugin \
cmake-Qt6QMngPlugin \
cmake-Qt6QTgaPlugin \
cmake-Qt6QTiffPlugin \
cmake-Qt6QWbmpPlugin \
cmake-Qt6QWebpPlugin \
qt6-imageformats-devel"

RDEPENDS:${PN} += "cmake-Qt6Gui \
libtiff-devel \
pkgconfig-jasper \
pkgconfig-libmng \
pkgconfig-libwebp \
qt6-imageformats"

inherit rpm
