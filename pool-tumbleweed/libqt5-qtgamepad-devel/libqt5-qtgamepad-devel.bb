SUMMARY = "Development files for the Qt5 gamepad library"
DESCRIPTION = "You need this package if you want to compile programs with QtGamepad."
LICENSE = "LGPL-3.0-only | GPL-2.0-only | GPL-3.0-or-later"

PV = "5.15.19+kde0"

RPM_NAME = "libqt5-qtgamepad-devel-5.15.19+kde0-1.2.aarch64.rpm"
RPM_HASH = "50d4bf98697efe76db550ca1f8f2606d99f9f307e25e4de5ee772b1e39af5d41b731e813fa3ed02e6fc9173251474162189d600f2e2123b2affb85da4118f898"

RPROVIDES:${PN} += "cmake-Qt5Gamepad \
libqt5-qtgamepad-devel \
pkgconfig-Qt5Gamepad"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt5Gamepad5 \
pkgconfig-Qt5Core \
pkgconfig-Qt5Gui"

inherit rpm
