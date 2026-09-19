SUMMARY = "Qt 5 MySQL support"
DESCRIPTION = "A plugin to support MySQL server in Qt applications."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.19+kde96"

RPM_NAME = "libQt5Sql5-mysql-5.15.19+kde96-1.3.aarch64.rpm"
RPM_HASH = "a7c362e0b02c995b7e38935770df756823f0ff4320bfa8616c190db9bb00e599ce0f4ed4f143c5b5287a9b71f4389fe457ac41f3bccec7372f69c8185b5a048a"

RPROVIDES:${PN} += "libQt5Sql5-mysql \
libqsqlmysql.so \
libqt5-sql-backend \
libqt5-sql-mysql"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Sql.so.5 \
libQt5Sql5 \
libc.so.6 \
libmariadb.so.3 \
libstdc++.so.6"

inherit rpm
