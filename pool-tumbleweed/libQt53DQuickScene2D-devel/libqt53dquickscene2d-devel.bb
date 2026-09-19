SUMMARY = "Development files for the Qt 5 3D Quick Scene 2D library"
DESCRIPTION = "Development files for the Qt 5 3D Quick Scene 2D library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.19+kde0"

RPM_NAME = "libQt53DQuickScene2D-devel-5.15.19+kde0-1.2.aarch64.rpm"
RPM_HASH = "f7d015b1ebf1dcdcf85bc86799a17c0280bf158356b0c589d9c74dc6435f9d7c5c8a59d2de1ee98b06cdbe2a6b8892f8bda43a9b257a58290a34d074a82a7de3"

RPROVIDES:${PN} += "cmake-Qt53DQuickScene2D \
libQt53DQuickScene2D-devel \
pkgconfig-Qt53DQuickScene2D"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt53DQuickScene2D5 \
pkgconfig-Qt53DCore \
pkgconfig-Qt53DQuick \
pkgconfig-Qt53DRender \
pkgconfig-Qt5Core \
pkgconfig-Qt5Gui \
pkgconfig-Qt5Qml"

inherit rpm
