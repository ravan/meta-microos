SUMMARY = "QML imports for the Qt 5 Sensors library"
DESCRIPTION = "Qt is a set of libraries for developing applications. \
 \
This package contains base tools, like string, xml, and network \
handling."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.19+kde0"

RPM_NAME = "libQt5Sensors5-imports-5.15.19+kde0-1.2.aarch64.rpm"
RPM_HASH = "77c7d59a28a9a0f9902bdd0575f076574024e865530f088510c8c3e4bf4ede5e8d7d719533acfd31695c11515e20fc57842219523b501d62cb6ef050e26cfe5d"

RPROVIDES:${PN} += "libQt5Sensors5-imports \
libdeclarative-sensors.so \
qt5qmlimport-QtSensors.5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Qml.so.5 \
libQt5Sensors.so.5 \
libQtQuick5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
