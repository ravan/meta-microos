SUMMARY = "Scalable datastore for metrics, events, and real-time analytics"
DESCRIPTION = "InfluxDB is an distributed time series database with no external dependencies. \
It's useful for recording metrics, events, and performing analytics."
LICENSE = "MIT"

PV = "2.7.10"

RPM_NAME = "influxdb2-2.7.10-1.17.aarch64.rpm"
RPM_HASH = "2cd926d374713f544e5ef0ea1e2a06738f04903c0d2a573ce5aac9b06567f8dddfa01f4c6c853a566f22822c630ffa87d92d007b4ded6cdbae67cae8dc2f9920"

RPROVIDES:${PN} += "config-influxdb2 \
group-influxdb \
influxdb2 \
user-influxdb"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6 \
libflux.so.0.199.0 \
systemd \
sysuser-shadow"

inherit rpm
