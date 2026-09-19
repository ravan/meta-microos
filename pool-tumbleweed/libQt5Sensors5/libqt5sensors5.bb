SUMMARY = "Qt 5 Sensors library"
DESCRIPTION = "The Qt Sensors API provides access to sensor hardware via QML and C++ \
interfaces. The Qt Sensors API also provides a motion gesture \
recognition API for devices."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.19+kde0"

RPM_NAME = "libQt5Sensors5-5.15.19+kde0-1.2.aarch64.rpm"
RPM_HASH = "26439924f5b783db6721d672e4b3c9738a81fc8ebaa360b2203b129986d4e17035c8b21d486fcac5dd0fd083b49d0d6f471fdfb6ab4165bf48246269452c33a5"

RPROVIDES:${PN} += "libQt5Sensors.so.5 \
libQt5Sensors5 \
libqtsensorgestures-counterplugin.so \
libqtsensorgestures-plugin.so \
libqtsensorgestures-shakeplugin.so \
libqtsensors-generic.so \
libqtsensors-iio-sensor-proxy.so \
libqtsensors-linuxsys.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Core5 \
libQt5DBus.so.5 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
