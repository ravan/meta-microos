SUMMARY = "Development files for the Qt 6 3DInput library"
DESCRIPTION = "Development files for the Qt 6 3DInput library."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-3dinput-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "a06ca7d4379ee1ab397c21326429667b4e8c1e5a4e790b0c6da99661521d0344753744462fdbaefbf7fde8bf00e359b1fb93fed5cd3bc613fa0afca4732c3400"

RPROVIDES:${PN} += "cmake-Qt63DInput \
pkgconfig-Qt63DInput \
qt6-3dinput-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt63DCore \
cmake-Qt6Gui \
libQt63DInput6 \
pkgconfig-Qt63DCore \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui"

inherit rpm
