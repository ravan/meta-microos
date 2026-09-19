SUMMARY = "Development files for the Qt 6 PrintSupport library"
DESCRIPTION = "Development files for the Qt 6 PrintSupport library."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-printsupport-devel-6.11.2-2.1.aarch64.rpm"
RPM_HASH = "3d41d12854e0fdc1eec178a9c70bde5c67d236dfb5d6ae9742e44d787c1e2d6d6101803d3cbfd076d718d75e5328768f0f95cc5d969b2e684f0f251ccd1095fc"

RPROVIDES:${PN} += "cmake-Qt6PrintSupport \
pkgconfig-Qt6PrintSupport \
qt6-printsupport-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Core \
cmake-Qt6Gui \
cmake-Qt6Widgets \
cups-devel \
libQt6PrintSupport6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui \
pkgconfig-Qt6Widgets"

inherit rpm
