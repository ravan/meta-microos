SUMMARY = "Qt 6 PostgreSQL plugin"
DESCRIPTION = "A plugin to access PostgreSQL servers in Qt applications. \
 \
The QPSQL driver supports version 9 and higher of the PostgreSQL \
server."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-sql-postgresql-6.11.2-2.1.aarch64.rpm"
RPM_HASH = "fd87aba5bf9469db172d2deb1b378a6f7d8926733daa7f0b2d41615ded147331acdc8a053beeb46f8e486d5026e8aacdd39b6b38983dc427483f8bbe610646d2"

RPROVIDES:${PN} += "libqsqlpsql.so \
qt6-sql-postgresql"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Sql.so.6 \
libQt6Sql6 \
libc.so.6 \
libpq.so.5 \
libstdc++.so.6"

inherit rpm
