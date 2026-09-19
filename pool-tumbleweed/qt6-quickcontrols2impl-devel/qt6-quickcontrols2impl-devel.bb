SUMMARY = "Qt6 QuickControls2Impl library - Development files"
DESCRIPTION = "Development files for the Qt 6 QuickControls2Impl library."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-quickcontrols2impl-devel-6.11.2-2.1.aarch64.rpm"
RPM_HASH = "0dc366692762814bcebdca1d8823ef2c4160d487a0314a6816773b7009a5cf5d652c278080b2346c3d6e4a0b9a89c9d404563220fd2c414da9890644651cad08"

RPROVIDES:${PN} += "cmake-Qt6QuickControls2BasicStyleImpl \
cmake-Qt6QuickControls2FluentWinUI3StyleImpl \
cmake-Qt6QuickControls2FusionStyleImpl \
cmake-Qt6QuickControls2ImagineStyleImpl \
cmake-Qt6QuickControls2Impl \
cmake-Qt6QuickControls2MaterialStyleImpl \
cmake-Qt6QuickControls2UniversalStyleImpl \
pkgconfig-Qt6QuickControls2BasicStyleImpl \
pkgconfig-Qt6QuickControls2FluentWinUI3StyleImpl \
pkgconfig-Qt6QuickControls2FusionStyleImpl \
pkgconfig-Qt6QuickControls2ImagineStyleImpl \
pkgconfig-Qt6QuickControls2Impl \
pkgconfig-Qt6QuickControls2MaterialStyleImpl \
pkgconfig-Qt6QuickControls2UniversalStyleImpl \
qt6-quickcontrols2impl-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Gui \
cmake-Qt6Qml \
cmake-Qt6Quick \
cmake-Qt6QuickTemplates2 \
libQt6QuickControls2Impl6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui \
pkgconfig-Qt6Quick"

inherit rpm
