SUMMARY = "Qt 6 Core 5 Compat library - Development files"
DESCRIPTION = "Development files for the Qt 6 Core 5 Compat library"
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-qt5compat-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "c255444c44989cb1e45ad7cd7eff004e6a41074e8cb28bbdb4219469da50ccaa60d686d16f4075a8715cfbaa71ad20cc5a81c36ba73c731ac03c41517573906e"

RPROVIDES:${PN} += "cmake-Qt6Core5Compat \
pkgconfig-Qt6Core5Compat \
qt6-qt5compat-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Core \
libQt6Core5Compat6 \
pkgconfig-Qt6Core"

inherit rpm
