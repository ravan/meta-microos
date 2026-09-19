SUMMARY = "InfluxDB development files"
DESCRIPTION = "Go sources and other development files for InfluxDB"
LICENSE = "MIT"

PV = "2.7.10"

RPM_NAME = "influxdb2-devel-2.7.10-1.17.aarch64.rpm"
RPM_HASH = "7ab8959de15a371f20e1666e95f193130425518f869cc77b16af53827af678d888f0a72bd84b2a9c93a9aab75a8fe8af17e777fb64474136ccae830aec7eefe2"

RPROVIDES:${PN} += "influxdb2-devel"

RDEPENDS:${PN} += "go"

inherit rpm
