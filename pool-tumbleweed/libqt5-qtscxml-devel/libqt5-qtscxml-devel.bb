SUMMARY = "Development files for Qt5's State Chart XML library"
DESCRIPTION = "You need this package if you want to compile programs with QtScxml."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.19+kde0"

RPM_NAME = "libqt5-qtscxml-devel-5.15.19+kde0-1.2.aarch64.rpm"
RPM_HASH = "1bb0cf02650fd23ca7361ddaf4756ebe84408c3d9a44a4937b8c355be335a1d23d03ed91f4a12070676ea9affbacdb80a784f0556f4cbfb9a12a30e19af16198"

RPROVIDES:${PN} += "cmake-Qt5Scxml \
libqt5-qtscxml-devel \
pkgconfig-Qt5Scxml"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt5Scxml5 \
libqt5-qtscxml-tools \
pkgconfig-Qt5Core \
pkgconfig-Qt5Qml"

inherit rpm
