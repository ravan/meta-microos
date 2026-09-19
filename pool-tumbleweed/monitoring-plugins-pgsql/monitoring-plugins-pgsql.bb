SUMMARY = "Test a PostgreSQL DBMS"
DESCRIPTION = "This plugin tests a PostgreSQL DBMS to determine whether it is active and \
accepting queries. It provides the check 'check_pgsql'."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.4.0"

RPM_NAME = "monitoring-plugins-pgsql-2.4.0-5.1.aarch64.rpm"
RPM_HASH = "20122ac6f88f039d8e02a8303967794e074c81e930a83fa471ff08778a4551e520dc112a1e98497a48c56e105ccda0e5db7e796a4b99c0591eb6a2fe18363dfd"

RPROVIDES:${PN} += "monitoring-plugins-pgsql \
nagios-plugins-pgsql"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpq.so.5"

inherit rpm
