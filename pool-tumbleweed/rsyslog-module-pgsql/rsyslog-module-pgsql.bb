SUMMARY = "PostgreSQL support module for rsyslog"
DESCRIPTION = "Rsyslog is an enhanced multi-threaded syslog daemon. See rsyslog \
package. \
 \
This module provides the support for logging into PostgreSQL databases."
LICENSE = "Apache-2.0 & GPL-3.0-or-later"

PV = "8.2608.0"

RPM_NAME = "rsyslog-module-pgsql-8.2608.0-1.1.aarch64.rpm"
RPM_HASH = "60625c421ba70352adfe0e509f370d37903454152850c76b492fd63d2d5add4d13826f011a5fa51d72ea03a699049bbb5e5f08b9c6801c63ca0d8c754e5cffc6"

RPROVIDES:${PN} += "rsyslog-module-pgsql"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpq.so.5 \
rsyslog"

inherit rpm
