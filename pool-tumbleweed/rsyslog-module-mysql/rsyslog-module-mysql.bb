SUMMARY = "MySQL support module for rsyslog"
DESCRIPTION = "Rsyslog is an enhanced multi-threaded syslog daemon. See rsyslog \
package. \
 \
This package provides a module with the support for logging into MySQL \
databases."
LICENSE = "Apache-2.0 & GPL-3.0-or-later"

PV = "8.2608.0"

RPM_NAME = "rsyslog-module-mysql-8.2608.0-1.1.aarch64.rpm"
RPM_HASH = "4092e8e1adaa74e1683ee70de54cf1af8584a30ab387e37dd54b2c3304a97008354212aba3f2c365d696d6ce0d9ee11c89baf668179ee6e442d2d5834609086b"

RPROVIDES:${PN} += "rsyslog-module-mysql"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmariadb.so.3 \
rsyslog"

inherit rpm
