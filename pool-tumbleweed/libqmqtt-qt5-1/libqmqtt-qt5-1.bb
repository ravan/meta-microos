SUMMARY = "MQTT client library for Qt5"
DESCRIPTION = "QMQTT is an MQTT client library for the Qt framework, speaking the MQTT 3.1 \
and 3.1.1 publish/subscribe protocols on top of QtNetwork. \
 \
This package provides the Qt5 shared library."
LICENSE = "EPL-1.0 | BSD-3-Clause"

PV = "1.0.8"

RPM_NAME = "libqmqtt-qt5-1-1.0.8-1.1.aarch64.rpm"
RPM_HASH = "34274d3c9a64eba1115b49a91fea457591e2837e375b7c09e28abc393771024bfbbdc2702d231647c03c62408cc94e940f1919856d5f9ce3e4d1746c5159fe0a"

RPROVIDES:${PN} += "libqmqtt-qt5-1 \
libqmqtt-qt5.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Network.so.5 \
libQt5WebSockets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
