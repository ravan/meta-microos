SUMMARY = "Development files for the Qt 6 3DCore library"
DESCRIPTION = "Development files for the Qt 6 3DCore library."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-3dcore-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "80c0b83ba6f453f9f174a64f28a0ecbab8e4fbc04bf34ce97728dc8b05b77afe5bafa5f6c307e64c775bf7143ae7fc1d7334e991b233ea99639ee83fa2589e7e"

RPROVIDES:${PN} += "cmake-Qt63DCore \
pkgconfig-Qt63DCore \
qt6-3dcore-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Concurrent \
cmake-Qt6Gui \
cmake-Qt6Network \
libQt63DCore6 \
pkgconfig-Qt6Concurrent \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui \
pkgconfig-Qt6Network"

inherit rpm
