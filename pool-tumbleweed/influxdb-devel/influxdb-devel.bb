SUMMARY = "InfluxDB development files"
DESCRIPTION = "Go sources and other development files for InfluxDB"
LICENSE = "MIT"

PV = "1.11.8"

RPM_NAME = "influxdb-devel-1.11.8-1.17.aarch64.rpm"
RPM_HASH = "2021eb984f032727e9c5565c7d88e45e8548cdaeb7323d488b271ac80cca9b053704a8b2bfd8a41cc76e5959eff1c84a96c734d7aabf5ae84e97c9a14c40fda2"

RPROVIDES:${PN} += "influxdb-devel"

RDEPENDS:${PN} += "go"

inherit rpm
