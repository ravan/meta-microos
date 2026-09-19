SUMMARY = "Shared C Library for mosquitto"
DESCRIPTION = "Mosquitto is a message broker that implements the \
MQ Telemetry Transport protocol versions 3.1 and 3.1.1. MQTT provides a \
lightweight method of carrying out messaging using a publish/subscribe model. \
 \
This package holds the shared C library."
LICENSE = "EPL-1.0"

PV = "2.0.23"

RPM_NAME = "libmosquitto1-2.0.23-1.4.aarch64.rpm"
RPM_HASH = "5caea00d13e17d0d2c25c99edd64eb246f191afc64a078790d518643816a9a441795f65160a4fa851fa2a75051f35bf7cf65d8b68e16b7b4c51390b2aa999566"

RPROVIDES:${PN} += "libmosquitto.so.1 \
libmosquitto1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libssl.so.3"

inherit rpm
