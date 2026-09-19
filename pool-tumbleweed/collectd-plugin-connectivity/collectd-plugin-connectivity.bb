SUMMARY = "Connectivity plugin for collectd"
DESCRIPTION = "Optional collectd plugin to collect Event-based interface status."
LICENSE = "GPL-2.0-only & MIT"

PV = "5.12.0.382.g2cd055fe"

RPM_NAME = "collectd-plugin-connectivity-5.12.0.382.g2cd055fe-3.1.aarch64.rpm"
RPM_HASH = "58a08b6577d2050e2be3653d757cf472dc1a15465238183c21403c9c59f0652d29be4ae9b11b77c0358909f9817d2c81e6a10105833be4a7d13dc7f498c9780c"

RPROVIDES:${PN} += "collectd-plugin-connectivity"

RDEPENDS:${PN} += "collectd \
ld-linux-aarch64.so.1 \
libc.so.6 \
libmnl.so.0 \
libyajl.so.2"

inherit rpm
