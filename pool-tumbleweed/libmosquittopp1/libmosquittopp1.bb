SUMMARY = "Shared C++ Library for mosquitto"
DESCRIPTION = "Mosquitto is a message broker that implements the \
MQ Telemetry Transport protocol versions 3.1 and 3.1.1. MQTT provides a \
lightweight method of carrying out messaging using a publish/subscribe model. \
 \
This package holds the shared C++ library."
LICENSE = "EPL-1.0"

PV = "2.0.23"

RPM_NAME = "libmosquittopp1-2.0.23-1.4.aarch64.rpm"
RPM_HASH = "14f51b257b596a578f6cde6364cd715bb1ce5c85ea6cb198a608917169dc6458b3df60375f674be91ed262fd0a8646ac7fb22bf72ee47873e1a203d8637cae40"

RPROVIDES:${PN} += "libmosquittopp.so.1 \
libmosquittopp1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libmosquitto.so.1 \
libstdc++.so.6"

inherit rpm
