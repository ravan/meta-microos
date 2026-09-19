SUMMARY = "Check MySQL/MariaDB database using DBI"
DESCRIPTION = "This program connects to an (SQL) database using DBI and checks the \
specified metric against threshold levels. The default metric is \
the result of the specified query. \
 \
This virtual package requires the needed libraries for check_dbi to work \
with a MySQL/MariaDB database."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.4.0"

RPM_NAME = "monitoring-plugins-dbi-mysql-2.4.0-5.1.aarch64.rpm"
RPM_HASH = "c7f1609e24e2793576322d172b041626843ae150f10f2254eddfac9d8b5e52e3a693b023922a74d682153401bb06cb45321f4432f894227c25447bf2576ecc6d"

RPROVIDES:${PN} += "monitoring-plugins-dbi-backend \
monitoring-plugins-dbi-mysql \
nagios-plugins-dbi-mysql"

RDEPENDS:${PN} += "libdbi-drivers-dbd-mysql \
monitoring-plugins-dbi"

inherit rpm
