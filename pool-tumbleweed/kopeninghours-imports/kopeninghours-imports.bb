SUMMARY = "QML imports for kopeninghours"
DESCRIPTION = "kopeninghours is a library for parsing and evaluating OSM opening hours \
expressions. \
This package contains QML imports for using kopeninghours in QML apps."
LICENSE = "LGPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kopeninghours-imports-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "205decc3f605588e4130e0716e3a3c375c6bb92c757eb38529eefb80d62746d9a03c2616d3fca45946fdd989c47c01051de23e57e2367ebb11438c37192768ca"

RPROVIDES:${PN} += "kopeninghours-imports \
libkopeninghoursqmlplugin.so \
qt6qmlimport-org.kde.kopeninghours \
qt6qmlimport-org.kde.kopeninghours.1"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKOpeningHours.so.1 \
libKOpeningHours1 \
libQt6Core.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
