SUMMARY = "Development Files for liblightdm-qt5-3-0"
DESCRIPTION = "This package contains development files needed for developing \
Qt5-based LightDM clients."
LICENSE = "LGPL-2.0-only | LGPL-3.0-only"

PV = "1.32.0"

RPM_NAME = "lightdm-qt5-devel-1.32.0-9.4.aarch64.rpm"
RPM_HASH = "e556c6f52052a8e3a7bbb8713146ecea054afa0d1f2194aa4d92e6cffc98a9896f3ccc0e79f9b3fd9c425cab7a1da6602672f5f63bd58826eae050778f2978a9"

RPROVIDES:${PN} += "lightdm-qt-devel \
lightdm-qt5-devel \
pkgconfig-liblightdm-qt5-3"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liblightdm-qt5-3-0 \
pkgconfig-Qt5Core \
pkgconfig-Qt5Gui"

inherit rpm
