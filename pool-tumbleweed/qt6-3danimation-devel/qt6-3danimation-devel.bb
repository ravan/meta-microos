SUMMARY = "Development files for the Qt 6 3DAnimation library"
DESCRIPTION = "Development files for the Qt 6 3DAnimation library."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-3danimation-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "b7ac7004a35f71f093cea1bb79d40cf89938f434bbc69a22f1b20b0e111bec88dc1caa1867a8b6190c530c1f4301b261e1ff9c2cbe6d185741d85ad0e41ba99a"

RPROVIDES:${PN} += "cmake-Qt63DAnimation \
pkgconfig-Qt63DAnimation \
qt6-3danimation-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt63DCore \
cmake-Qt63DRender \
cmake-Qt6Gui \
libQt63DAnimation6 \
pkgconfig-Qt63DCore \
pkgconfig-Qt63DRender \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui"

inherit rpm
