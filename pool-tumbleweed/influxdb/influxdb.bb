SUMMARY = "Scalable datastore for metrics, events, and real-time analytics"
DESCRIPTION = "InfluxDB is an distributed time series database with no external dependencies. \
It's useful for recording metrics, events, and performing analytics."
LICENSE = "MIT"

PV = "1.11.8"

RPM_NAME = "influxdb-1.11.8-1.17.aarch64.rpm"
RPM_HASH = "8f23a6ef2a87c2b5ad092971bb366395336167c717595fda64bcd07b506f52b71382133bb8d21d18ec6781442c8971e26fd6cbbaa280c828874693fca519643e"

RPROVIDES:${PN} += "config-influxdb \
group-influxdb \
influxdb \
user-influxdb"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6 \
libflux.so.0.199.0 \
shadow"

inherit rpm
