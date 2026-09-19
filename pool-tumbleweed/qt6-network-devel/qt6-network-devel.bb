SUMMARY = "Development files for the Qt 6 Network library"
DESCRIPTION = "Development files for the Qt 6 Network library."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-network-devel-6.11.2-2.1.aarch64.rpm"
RPM_HASH = "442e6f70e369f97116f0914b9114e369d8c1eaf4e630c3a6b5db2e2c04059c7ceef8b0ac18e5a4c84653d706e993eb0985f9b2d52fea702f3eb5ee68920ecbf8"

RPROVIDES:${PN} += "cmake-Qt6Network \
pkgconfig-Qt6Network \
qt6-network-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Core \
libQt6Network6 \
pkgconfig-Qt6Core"

inherit rpm
