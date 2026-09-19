SUMMARY = "MySQL Module for ProFTPD"
DESCRIPTION = "This is the MySQL Module for ProFTPD"
LICENSE = "GPL-2.0-or-later"

PV = "1.3.9c"

RPM_NAME = "proftpd-mysql-1.3.9c-2.1.aarch64.rpm"
RPM_HASH = "2bd4b7e402160d3a6fcf9db33f34cdff2e2a0b90e1526ba86362b13b007f74877f62362924f05dcc139508a66a12206df2f39d1d935cd8d1f6ac83292bbb78f3"

RPROVIDES:${PN} += "proftpd-mysql"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmariadb.so.3 \
proftpd"

inherit rpm
