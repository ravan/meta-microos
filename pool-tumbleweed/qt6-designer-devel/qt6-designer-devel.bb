SUMMARY = "Qt 6 Designer libraries - Development files"
DESCRIPTION = "Development files for the Qt6 Designer libraries."
LICENSE = "(GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only) & GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "6.11.2"

RPM_NAME = "qt6-designer-devel-6.11.2-2.3.aarch64.rpm"
RPM_HASH = "2901dd3cc37357b241eee2854838ed8ca2253f50492934d786c19c4500317b5ede5c912c3d516f908b9867a10bc9f2a94e36cc545ad0c397e1193d1f7e5ae887"

RPROVIDES:${PN} += "cmake-Qt6Designer \
cmake-Qt6QQuickWidgetPlugin \
cmake-Qt6UiPlugin \
pkgconfig-Qt6Designer \
pkgconfig-Qt6UiPlugin \
qt6-designer-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Gui \
cmake-Qt6OpenGL \
cmake-Qt6OpenGLWidgets \
cmake-Qt6Widgets \
cmake-Qt6Xml \
libQt6Designer6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui \
pkgconfig-Qt6OpenGLWidgets \
pkgconfig-Qt6UiPlugin \
pkgconfig-Qt6Widgets \
pkgconfig-Qt6Xml"

inherit rpm
