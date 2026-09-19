SUMMARY = "InfluxDB UDP protocol plugin for collectd"
DESCRIPTION = "Optional collectd plugin to send values to InfluxDB using line protocol via udp. \
For HTTP line protocol use write_http plugin."
LICENSE = "GPL-2.0-only & MIT"

PV = "5.12.0.382.g2cd055fe"

RPM_NAME = "collectd-plugin-write_influxdb_udp-5.12.0.382.g2cd055fe-3.1.aarch64.rpm"
RPM_HASH = "0a5d9376af77a669ba14dbda2ce249dd2f0df00eb5d7bd2edeeb7442de1ba9aefdbc1c8b2f198a7a73e055c0327dda0baf453085ad595a36ea9cf72db44e4b6f"

RPROVIDES:${PN} += "collectd-plugin-write-influxdb-udp"

RDEPENDS:${PN} += "collectd \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
