SUMMARY = "Qt6 Quick3DIblBaker library - Development files"
DESCRIPTION = "Development files for the Qt 6 Quick3DIblBaker library."
LICENSE = "GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-quick3diblbaker-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "15bf7e8673ce03666a7cd36263b9502af5bb8ed33ef60aebea444f4246bcdc55a1d57be704bf01885d4cdf38923878daff42ff8ddf91b6430d15d4c455f34ef3"

RPROVIDES:${PN} += "cmake-Qt6Quick3DIblBaker \
pkgconfig-Qt6Quick3DIblBaker \
qt6-quick3diblbaker-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Gui \
cmake-Qt6Quick \
cmake-Qt6Quick3DRuntimeRender \
libQt6Quick3DIblBaker6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui \
pkgconfig-Qt6Quick \
pkgconfig-Qt6Quick3DRuntimeRender"

inherit rpm
