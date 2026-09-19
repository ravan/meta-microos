SUMMARY = "MariaDB connector in C"
DESCRIPTION = "MariaDB Connector is used to connect applications developed in \
C or C++ to MariaDB and MySQL databases. This is a different \
implementation from the traditional libmariadbclient/libmysqlclient \
that is shipped with mariadb-server/mysql-server, but the API is the same. \
 \
This package holds the runtime components."
LICENSE = "LGPL-2.1-or-later"

PV = "3.4.9"

RPM_NAME = "libmariadb3-3.4.9-2.1.aarch64.rpm"
RPM_HASH = "8890c961cf3d2401fe768ed382d8e22f3b20a90e36e9ef4d574f90a7767398f642207b100667c83b796b6c65c51fc49a869e77458e23399b4557020048000981"

RPROVIDES:${PN} += "libmariadb.so.3 \
libmariadb3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libssl.so.3 \
libz.so.1"

inherit rpm
