SUMMARY = "Development files for the Qt5 X11 Extras library"
DESCRIPTION = "You need this package if you want to compile programs with qtx11extras."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.19+kde0"

RPM_NAME = "libqt5-qtx11extras-devel-5.15.19+kde0-1.3.aarch64.rpm"
RPM_HASH = "cd3712ef8c1bc8549fe4545f0760e1466e7bfe766dbe6c5b04c0a1e080a894d5d4653e83d27b0d1a415029e78aca491b2b8815520ea141efc3fb26a85b9f471b"

RPROVIDES:${PN} += "cmake-Qt5X11Extras \
libQt5X11Extras-devel \
libqt5-qtx11extras-devel \
pkgconfig-Qt5X11Extras"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt5X11Extras5 \
pkgconfig-Qt5Core \
pkgconfig-Qt5Gui"

inherit rpm
