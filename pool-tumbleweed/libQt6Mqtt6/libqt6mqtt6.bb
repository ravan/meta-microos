SUMMARY = "Qt 6 MQTT library"
DESCRIPTION = "Qt library to implement MQTT protocol version 3.1 and 3.1.1"
LICENSE = "GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "6.11.2"

RPM_NAME = "libQt6Mqtt6-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "ae1965a08749686b534ac6fac11efce02270d222ec46b6a5dabf36b91da0c911633cf81570cd14e7f86b4b956155a3058da1a70a61cfeefeb34ae64c8d48b1d4"

RPROVIDES:${PN} += "libQt6Mqtt.so.6 \
libQt6Mqtt6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Network.so.6 \
libQt6WebSockets.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
