SUMMARY = "Qt5 Positioning Library for Qt Quick"
DESCRIPTION = "This library contains glue code for using the Qt Location module in Qt Quick \
applications."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.19+kde7"

RPM_NAME = "libQt5PositioningQuick5-5.15.19+kde7-1.2.aarch64.rpm"
RPM_HASH = "9635441c4e97268ba37a284ccc1ba2478a1b5fcc63cea82881b8e3ef7ba51263766df2473b8be77dffc9bf54228c5fcfe8acf56800a1002705224a875046d3b3"

RPROVIDES:${PN} += "libQt5PositioningQuick.so.5 \
libQt5PositioningQuick5 \
libdeclarative-positioning.so \
qt5qmlimport-QtPositioning.5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Network.so.5 \
libQt5Positioning.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
