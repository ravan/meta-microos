SUMMARY = "Qt 6 MultimediaWidgets library - Development files"
DESCRIPTION = "Development files for the Qt 6 MultimediaWidgets library."
LICENSE = "GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-multimediawidgets-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "835fa3e1434cefe4aac9b345ac3cfa9cc95f60f067eafb95bcd9bb7916e2bcbcebac549b83718e6ac9978f74178b19a3dac85fcd384b56a44859015714736418"

RPROVIDES:${PN} += "cmake-Qt6MultimediaWidgets \
pkgconfig-Qt6MultimediaWidgets \
qt6-multimediawidgets-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Gui \
cmake-Qt6Multimedia \
cmake-Qt6Widgets \
libQt6MultimediaWidgets6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui \
pkgconfig-Qt6Multimedia \
pkgconfig-Qt6Widgets"

inherit rpm
