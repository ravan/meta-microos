SUMMARY = "Qt Development Kit"
DESCRIPTION = "You need this package if you want to compile programs with qtquickcontrols2."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.19+kde5"

RPM_NAME = "libQt5QuickControls2-devel-5.15.19+kde5-1.2.aarch64.rpm"
RPM_HASH = "bcb34b7288ac35a44096275821ca387d97cb96357be6fcb5383217ac0e947e6f088618e79f73a5285240486c990334e0ee0da0d7effc4369491030ee502cc172"

RPROVIDES:${PN} += "cmake-Qt5QuickControls2 \
libQt5QuickControls2-devel \
pkgconfig-Qt5QuickControls2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt5QuickControls2-5 \
pkgconfig-Qt5Core \
pkgconfig-Qt5Gui \
pkgconfig-Qt5Quick"

inherit rpm
