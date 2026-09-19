SUMMARY = "Qt Development Kit"
DESCRIPTION = "You need this package, if you want to compile programs with qtsensors."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.19+kde0"

RPM_NAME = "libqt5-qtconnectivity-devel-5.15.19+kde0-1.2.aarch64.rpm"
RPM_HASH = "b1016f2d4998f4005be2d2a31abb35e2f1f6d56abc20bdfdd6db1f633b8010be27a6a27365c9e78819ffee860d11150735e70568a6e8e95c030ecbab4f1416c7"

RPROVIDES:${PN} += "cmake-Qt5Bluetooth \
cmake-Qt5Nfc \
libqt5-qtconnectivity-devel \
pkgconfig-Qt5Bluetooth \
pkgconfig-Qt5Nfc"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt5Bluetooth5 \
libQt5Nfc5 \
pkgconfig-Qt5Core"

inherit rpm
