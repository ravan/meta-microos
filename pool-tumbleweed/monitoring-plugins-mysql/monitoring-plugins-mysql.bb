SUMMARY = "Test a MySQL DBMS"
DESCRIPTION = "This plugin tests a MySQL DBMS to determine whether it is active and \
accepting queries. It provides the two checks: 'check_mysql' and \
'check_mysql_query'."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.4.0"

RPM_NAME = "monitoring-plugins-mysql-2.4.0-5.1.aarch64.rpm"
RPM_HASH = "e6c6de62d8bf14f6e2d59e724f388ada886ed4bdbe16c59a302203798989d622fd9bff687974ed3ed37ea175cf6f0a53d15e1aaf9074eb4a03b3fe514aada746"

RPROVIDES:${PN} += "config-monitoring-plugins-mysql \
monitoring-plugins-mysql \
monitoring-plugins-mysql-query \
nagios-plugins-mysql"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmariadb.so.3"

inherit rpm
