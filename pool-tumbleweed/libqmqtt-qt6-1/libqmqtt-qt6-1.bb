SUMMARY = "MQTT client library for Qt6"
DESCRIPTION = "QMQTT is an MQTT client library for the Qt framework, speaking the MQTT 3.1 \
and 3.1.1 publish/subscribe protocols on top of QtNetwork. \
 \
This package provides the Qt6 shared library."
LICENSE = "EPL-1.0 | BSD-3-Clause"

PV = "1.0.8"

RPM_NAME = "libqmqtt-qt6-1-1.0.8-1.1.aarch64.rpm"
RPM_HASH = "afb428c26bdba880c3615113d82f578966a55b8e9463f6b96b742e9d4bc47f11b5956ab0d879b9d1c987980616c101cc89d8eaad7a72ac99b696fc29675904b1"

RPROVIDES:${PN} += "libqmqtt-qt6-1 \
libqmqtt-qt6.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Network.so.6 \
libQt6WebSockets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
