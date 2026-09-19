SUMMARY = "Check PostgreSQL database using DBI"
DESCRIPTION = "This program connects to an (SQL) database using DBI and checks the \
specified metric against threshold levels. The default metric is \
the result of the specified query. \
 \
This virtual package requires the needed libraries for check_dbi to work \
with a PostgreSQL database"
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.4.0"

RPM_NAME = "monitoring-plugins-dbi-pgsql-2.4.0-5.1.aarch64.rpm"
RPM_HASH = "e546511f764a3570cac3c06725c8f2d903c2e9168b58965e45c98ddf15afbfe6bd8d73d597744b3c4533ecb518e4d087d368ddf494f6fd24ce63142209179875"

RPROVIDES:${PN} += "monitoring-plugins-dbi-backend \
monitoring-plugins-dbi-pgsql \
nagios-plugins-dbi-pgsql"

RDEPENDS:${PN} += "libdbi-drivers-dbd-pgsql \
monitoring-plugins-dbi"

inherit rpm
