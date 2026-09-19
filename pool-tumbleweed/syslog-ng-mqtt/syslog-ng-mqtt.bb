SUMMARY = "MQTT support for syslog-ng"
DESCRIPTION = "This package provides MQTT support for syslog-ng"
LICENSE = "GPL-2.0-only"

PV = "4.12.0"

RPM_NAME = "syslog-ng-mqtt-4.12.0-1.4.aarch64.rpm"
RPM_HASH = "b0242bc52036af325b20d0d790aa4fb71973ace838958d1f4fdf00d074ce12928fd42c0e0eb8b16b51ba1f0d0cf7086f5170feae0743f3bc04a224ae1db58521"

RPROVIDES:${PN} += "syslog-ng-mqtt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libevtlog-4.12.so.0 \
libglib-2.0.so.0 \
libpaho-mqtt3cs.so.1 \
libsyslog-ng-4.12.so.0 \
syslog-ng"

inherit rpm
