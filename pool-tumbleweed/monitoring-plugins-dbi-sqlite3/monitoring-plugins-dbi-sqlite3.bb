SUMMARY = "Check SQlite3 database using DBI"
DESCRIPTION = "This program connects to an (SQL) database using DBI and checks the \
specified metric against threshold levels. The default metric is \
the result of the specified query. \
 \
This virtual package requires the needed libraries for check_dbi to work \
with a SQlite database."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.4.0"

RPM_NAME = "monitoring-plugins-dbi-sqlite3-2.4.0-5.1.aarch64.rpm"
RPM_HASH = "5e841ef2418e8e5a27cd9240e3fa853305c1bd961bc62b8290efe953ea6341931f3765fec2d3d4dcdf15059e7b7238da1512b71a4a1e43fa2674e176702edf19"

RPROVIDES:${PN} += "monitoring-plugins-dbi-backend \
monitoring-plugins-dbi-sqlite3 \
nagios-plugins-dbi-sqlite3"

RDEPENDS:${PN} += "libdbi-drivers-dbd-sqlite3 \
monitoring-plugins-dbi"

inherit rpm
