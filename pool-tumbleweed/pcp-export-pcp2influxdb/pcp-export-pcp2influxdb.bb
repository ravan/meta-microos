SUMMARY = "Performance Co-Pilot tools for exporting PCP metrics to InfluxDB"
DESCRIPTION = "Performance Co-Pilot (PCP) front-end tools for exporting metric values \
to InfluxDB (https://influxdata.com/time-series-platform/influxdb)."
LICENSE = "GPL-2.0+"

PV = "6.3.8"

RPM_NAME = "pcp-export-pcp2influxdb-6.3.8-3.1.noarch.rpm"
RPM_HASH = "6bf144d732a7b533d98b389c2a69344557df908faef7ad7dfc910913eb399f24fa5a55958231fbc7a3ee406bd60bec6ea1f9aa987182e5a81bc4eeeb0c02924c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pcp-export-pcp2influxdb"

RDEPENDS:${PN} += "/usr/bin/pmpython \
python3-pcp \
python3-requests"

inherit rpm
