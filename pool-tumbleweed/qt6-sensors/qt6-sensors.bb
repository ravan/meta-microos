SUMMARY = "Qt Sensors API to access sensor hardware"
DESCRIPTION = "The Qt Sensors API provides access to sensor hardware via QML and C++ \
interfaces. The Qt Sensors API also provides a motion gesture recognition API \
for devices."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-sensors-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "174e9b1696de93e62e4852312134286984f743476fe2d00b12bd861949d887116f4c1ee3930f432dd8e97f5b5ab9cada15b0e787c29714c09609c0c006e8db19"

RPROVIDES:${PN} += "libqtsensors-generic.so \
libqtsensors-iio-sensor-proxy.so \
qt6-sensors"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Sensors.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
