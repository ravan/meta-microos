SUMMARY = "GPSD monitoring plugin for collectd"
DESCRIPTION = "Optional collectd plugin to monitor gpsd."
LICENSE = "GPL-2.0-only & MIT"

PV = "5.12.0.382.g2cd055fe"

RPM_NAME = "collectd-plugin-gps-5.12.0.382.g2cd055fe-3.1.aarch64.rpm"
RPM_HASH = "b2fbb8b451d54b7a15f2d9bb211769ee0376b9cd90330a58c9f0a0792d2ed0c77337bdbe4cfd6277abef639f144a3ca83e1da460bd6c395f185dda01d47b34de"

RPROVIDES:${PN} += "collectd-plugin-gps"

RDEPENDS:${PN} += "collectd \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgps.so.32"

inherit rpm
