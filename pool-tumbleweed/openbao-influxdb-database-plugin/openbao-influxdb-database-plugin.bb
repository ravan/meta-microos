SUMMARY = "OpenBao database plugin for InfluxDB"
DESCRIPTION = "OpenBao database plugin for InfluxDB"
LICENSE = "MPL-2.0"

PV = "2.6.2"

RPM_NAME = "openbao-influxdb-database-plugin-2.6.2-1.1.aarch64.rpm"
RPM_HASH = "6ddc2f874d7baa5f2b53acb66b366e71a3fee0ad0f3f8868903d0c36d94a783eedf9613ded1258a27c1e099f359e41e81bfb553942cca2352f32d5a548dbd9c1"

RPROVIDES:${PN} += "openbao-influxdb-database-plugin"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
