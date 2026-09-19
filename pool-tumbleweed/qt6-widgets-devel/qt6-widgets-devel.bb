SUMMARY = "Development files for the Qt 6 Widgets library"
DESCRIPTION = "Development files for the Qt 6 Widgets library."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-widgets-devel-6.11.2-2.1.aarch64.rpm"
RPM_HASH = "6c21a1bbae6a24639d5dffa60b3d5708474f3be2c3ad80045a38eff206651062a9c97d9c720cb31edc7d81c4d43c0f7de7762779b5efb905931d198abc009851"

RPROVIDES:${PN} += "cmake-Qt6Widgets \
cmake-Qt6WidgetsTools \
pkgconfig-Qt6Widgets \
qt6-widgets-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Core \
cmake-Qt6Gui \
libQt6Widgets6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui"

inherit rpm
