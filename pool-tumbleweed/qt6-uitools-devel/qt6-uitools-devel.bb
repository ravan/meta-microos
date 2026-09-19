SUMMARY = "Qt 6 UiTools library - Development files"
DESCRIPTION = "Development files for the Qt6 UiTools library."
LICENSE = "(GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only) & GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "6.11.2"

RPM_NAME = "qt6-uitools-devel-6.11.2-2.3.aarch64.rpm"
RPM_HASH = "5204dc74997bb326139e1d787777fc716a54c30d4a5f50790d26ecc4199e82c43a1fe866c3f553dfba7315feb1d42aca4edfe6a1a348f4fd931a92701019df79"

RPROVIDES:${PN} += "cmake-Qt6UiTools \
pkgconfig-Qt6UiTools \
qt6-uitools-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Gui \
cmake-Qt6OpenGL \
cmake-Qt6OpenGLWidgets \
cmake-Qt6UiPlugin \
cmake-Qt6Widgets \
libQt6UiTools6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui \
pkgconfig-Qt6OpenGLWidgets \
pkgconfig-Qt6Widgets"

inherit rpm
