SUMMARY = "Development files for mosquitto"
DESCRIPTION = "Mosquitto is a message broker that implements the \
MQ Telemetry Transport protocol versions 3.1 and 3.1.1. MQTT provides a \
lightweight method of carrying out messaging using a publish/subscribe model. \
 \
This package holds the development files."
LICENSE = "EPL-1.0"

PV = "2.0.23"

RPM_NAME = "mosquitto-devel-2.0.23-1.4.aarch64.rpm"
RPM_HASH = "7d909708837f8a4a23346e56387a6339b2985509e4c964cd597bbd9894ca5a49d430ece1fa04593de58155018c0101ed9c1bd3fd5d971dd5c3d94697e3d178af"

RPROVIDES:${PN} += "libmosquitto-devel \
libmosquittopp-devel \
mosquitto-devel \
pkgconfig-libmosquitto \
pkgconfig-libmosquittopp"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmosquitto1 \
libmosquittopp1"

inherit rpm
