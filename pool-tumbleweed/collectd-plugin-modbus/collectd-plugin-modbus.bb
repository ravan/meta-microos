SUMMARY = "TCP Modbus Plugin for collectd"
DESCRIPTION = "Optional collectd plugin to communicate with TCP Modbus devices."
LICENSE = "GPL-2.0-only & MIT"

PV = "5.12.0.382.g2cd055fe"

RPM_NAME = "collectd-plugin-modbus-5.12.0.382.g2cd055fe-3.1.aarch64.rpm"
RPM_HASH = "2911b9673e51baa6b0b2e7911e04235be314e4c59d14958dc2d4f8f4e206fafcb9a067f3a3020f9c2f8e6329f4c757f14faa78b5bec993f6e4a67302f8428204"

RPROVIDES:${PN} += "collectd-plugin-modbus"

RDEPENDS:${PN} += "collectd \
ld-linux-aarch64.so.1 \
libc.so.6 \
libmodbus.so.5"

inherit rpm
