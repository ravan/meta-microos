SUMMARY = "Check databases using DBI"
DESCRIPTION = "This program connects to an (SQL) database using DBI and checks the \
specified metric against threshold levels. The default metric is \
the result of the specified query. \
 \
This package provides the check_dbi plugin."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.4.0"

RPM_NAME = "monitoring-plugins-dbi-2.4.0-5.1.aarch64.rpm"
RPM_HASH = "c1fbe3cc30d9fca980dfbbba2c1f16345cf6261657187e90402cc697de312c931030cba9f376d03010b7fe444b9eb14fd15efcf017f2e113d6855150cd44fcaf"

RPROVIDES:${PN} += "monitoring-plugins-dbi \
nagios-plugins-dbi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdbi.so.3 \
monitoring-plugins-dbi-backend"

inherit rpm
