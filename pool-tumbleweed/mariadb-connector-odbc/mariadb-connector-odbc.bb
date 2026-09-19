SUMMARY = "MariaDB ODBC Connector"
DESCRIPTION = "This package contains the MariaDB ODBC Connector to be used with unixODBC."
LICENSE = "LGPL-2.1-or-later"

PV = "3.2.6"

RPM_NAME = "mariadb-connector-odbc-3.2.6-1.5.aarch64.rpm"
RPM_HASH = "6db88273e3800673e9e1103a4682014f680ebc5eace6cd664491c03b163f5c546a4cf6304e045cfe0d23674fd2e7615eab7e78e0afcb423dbd4a9f06cb86d320"

RPROVIDES:${PN} += "libmaodbc.so \
mariadb-connector-odbc"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libmariadb.so.3 \
libodbcinst.so.2 \
libstdc++.so.6"

inherit rpm
