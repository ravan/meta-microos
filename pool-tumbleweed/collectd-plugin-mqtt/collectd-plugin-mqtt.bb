SUMMARY = "MQTT Plugin for collectd"
DESCRIPTION = "Optional collectd plugin to send and receive MQTT messages."
LICENSE = "GPL-2.0-only & MIT"

PV = "5.12.0.382.g2cd055fe"

RPM_NAME = "collectd-plugin-mqtt-5.12.0.382.g2cd055fe-3.1.aarch64.rpm"
RPM_HASH = "8ff099312973c7406d62c60abd717db4160470d96653e455f8320aedfb3d9496e23f24ef018e038f61e75208c8cdf35382880fd668d65a6f22f4f42532e5cade"

RPROVIDES:${PN} += "collectd-plugin-mqtt"

RDEPENDS:${PN} += "collectd \
ld-linux-aarch64.so.1 \
libc.so.6 \
libmosquitto.so.1 \
libyajl.so.2"

inherit rpm
