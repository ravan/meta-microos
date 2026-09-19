SUMMARY = "Development files for the Qt5 SVG library"
DESCRIPTION = "You need this package if you want to compile programs with QtSvg."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.19+kde5"

RPM_NAME = "libqt5-qtsvg-devel-5.15.19+kde5-1.3.aarch64.rpm"
RPM_HASH = "ec3d64deb56c0e4729b8c3b961d33569237f174baa1f9105a7cc297569caa894e07edb768d2f8d9f348b26fac85bb638d9e43884354b261dc8318f6396191811"

RPROVIDES:${PN} += "cmake-Qt5Svg \
libQt5Svg-devel \
libqt5-qtsvg-devel \
pkgconfig-Qt5Svg"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt5Svg5 \
pkgconfig-Qt5Core \
pkgconfig-Qt5Gui \
pkgconfig-Qt5Widgets"

inherit rpm
