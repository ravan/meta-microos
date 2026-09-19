SUMMARY = "Qt 6 Qml library - Development files"
DESCRIPTION = "Development files for the Qt 6 Qml library."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-qml-devel-6.11.2-2.1.aarch64.rpm"
RPM_HASH = "a2dec96962b6e66e477fe07dcf8b06773de38a085b41a01c567a92dde503cf48d2c899fe3ed8c43d3dbc37978efb702a995a279e90e4772751d867d617971eb5"

RPROVIDES:${PN} += "cmake-Qt6Qml \
cmake-Qt6QmlImportScanner \
cmake-Qt6QmlIntegration \
cmake-Qt6QmlTools \
pkgconfig-Qt6Qml \
pkgconfig-Qt6QmlIntegration \
qt6-qml-devel \
qt6-qmldevtools-devel-static"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Network \
cmake-Qt6QmlPrivate \
libQt6Qml6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Network \
pkgconfig-Qt6QmlIntegration \
qt6-declarative-tools"

inherit rpm
