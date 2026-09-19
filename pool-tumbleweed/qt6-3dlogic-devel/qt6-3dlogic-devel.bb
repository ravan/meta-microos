SUMMARY = "Development files for the Qt 6 3DLogic library"
DESCRIPTION = "Development files for the Qt 6 3DLogic library."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-3dlogic-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "2e5e20754e15fe89de66402ede207f94cadd19400c337680eb02b87949ce5aca02cbfca2178d1d941867ba6258af4ddc2eba907aaf87d196301d830fbdcdd44f"

RPROVIDES:${PN} += "cmake-Qt63DLogic \
pkgconfig-Qt63DLogic \
qt6-3dlogic-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt63DCore \
cmake-Qt6Gui \
libQt63DLogic6 \
pkgconfig-Qt63DCore \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui"

inherit rpm
