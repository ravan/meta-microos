SUMMARY = "Development files for the Qt 6 OpenGLWidgets library"
DESCRIPTION = "Development files for the Qt 6 OpenGLWidgets library."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-openglwidgets-devel-6.11.2-2.1.aarch64.rpm"
RPM_HASH = "9c3aca5399ae6dbcb7bf30cc3146f2e729bdc0894098f7c069ab6daeec6d673b17225dc0dfd7502af50c84fb8950dbc7f82579bca86f256ef47f06197a7576a0"

RPROVIDES:${PN} += "cmake-Qt6OpenGLWidgets \
pkgconfig-Qt6OpenGLWidgets \
qt6-openglwidgets-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
Mesa-libGLESv3-devel \
cmake-Qt6OpenGL \
cmake-Qt6Widgets \
libQt6OpenGLWidgets6 \
pkgconfig-Qt6OpenGL \
pkgconfig-Qt6Widgets \
pkgconfig-glesv2"

inherit rpm
