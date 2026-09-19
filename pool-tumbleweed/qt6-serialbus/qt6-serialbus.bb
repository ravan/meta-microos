SUMMARY = "Qt 6 SerialBus library"
DESCRIPTION = "Qt 6 SerialBus library."
LICENSE = "GPL-2.0-or-later | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-serialbus-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "d5a8197da161a6a49efc87590f13356e5641f8629842764ad968bdb086d40f7a66cf323040c6ab7e60b691a22d5399a57d91551bddf546ee8a702f402cb8d51c"

RPROVIDES:${PN} += "libqtpassthrucanbus.so \
libqtpeakcanbus.so \
libqtsocketcanbus.so \
libqttinycanbus.so \
libqtvirtualcanbus.so \
qt6-serialbus"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Network.so.6 \
libQt6SerialBus.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
