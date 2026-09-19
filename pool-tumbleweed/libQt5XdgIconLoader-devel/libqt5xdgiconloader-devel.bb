SUMMARY = "Devel files for libQt5XdgIconLoader"
DESCRIPTION = "Development files for QtXDG icon loader libraries used in LXQt"
LICENSE = "GPL-3.0-only"

PV = "3.12.0"

RPM_NAME = "libQt5XdgIconLoader-devel-3.12.0-3.12.aarch64.rpm"
RPM_HASH = "90458c605831db930d5b7c6a32c24e0c84846f9c21f15c01f28d7ed76b1b51850655202425f18584f7679ce210e1874867b87caebe12dace8ae437e878fb8214"

RPROVIDES:${PN} += "cmake-qt5xdgiconloader \
libQt5XdgIconLoader-devel \
libQt5XdgIconPlugin.so \
pkgconfig-Qt5XdgIconLoader"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5XdgIconLoader.so.3 \
libQt5XdgIconLoader3 \
libc.so.6 \
libstdc++.so.6 \
pkgconfig-Qt5Gui \
pkgconfig-Qt5Svg"

inherit rpm
