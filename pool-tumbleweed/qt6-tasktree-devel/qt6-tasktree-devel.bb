SUMMARY = "Qt 6 TaskTree library - Development files"
DESCRIPTION = "Development files for the Qt 6 TaskTree library."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-tasktree-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "8641faa8b333a23bf61d24760ca18dcec9a54120f8036cbac966ba6764526f73defda50c14d81118e02dd96b56fa9ec1f73da92742cf9df3524df7e628961bcf"

RPROVIDES:${PN} += "cmake-Qt6TaskTree \
pkgconfig-Qt6TaskTree \
qt6-tasktree-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Concurrent \
cmake-Qt6Core \
cmake-Qt6Network \
libQt6TaskTree6 \
pkgconfig-Qt6Concurrent \
pkgconfig-Qt6Core \
pkgconfig-Qt6Network"

inherit rpm
