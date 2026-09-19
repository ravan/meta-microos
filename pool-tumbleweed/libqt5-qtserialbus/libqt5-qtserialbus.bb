SUMMARY = "Qt 5 Serial Bus Addon"
DESCRIPTION = "The Qt Serial Bus API provides classes and functions to access the \
various industrial serial buses and protocols, such as CAN, ModBus, \
and others."
LICENSE = "LGPL-3.0-only | GPL-2.0-or-later"

PV = "5.15.19+kde0"

RPM_NAME = "libqt5-qtserialbus-5.15.19+kde0-1.3.aarch64.rpm"
RPM_HASH = "3da0dc8eb72a535fc9d80e81cf59fa77b03603d76f0d55e812f4c482a765cd17488c8b6d14e47ec7301afb8073151244955ce4586a6edc2532d0e2183748818a"

RPROVIDES:${PN} += "libqt5-qtserialbus \
libqtpassthrucanbus.so \
libqtpeakcanbus.so \
libqtsocketcanbus.so \
libqttinycanbus.so \
libqtvirtualcanbus.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Network.so.5 \
libQt5SerialBus.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
