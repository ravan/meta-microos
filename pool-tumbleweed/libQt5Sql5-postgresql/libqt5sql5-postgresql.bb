SUMMARY = "Qt 5 PostgreSQL plugin"
DESCRIPTION = "The Qt SQL module uses driver plugins to communicate with the \
different database APIs. \
 \
The QPSQL driver supports version 7.3 and higher of the PostgreSQL \
server."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.19+kde96"

RPM_NAME = "libQt5Sql5-postgresql-5.15.19+kde96-1.3.aarch64.rpm"
RPM_HASH = "346d1215dc39951767c313e6c3352433717ddbe5f630e7ff7acc5a573ec510b4bb05c965b6d1588e804ac5b1fce704d1d3c3753318b8567418ee241e76a9e941"

RPROVIDES:${PN} += "libQt5Sql5-postgresql \
libqsqlpsql.so \
libqt5-sql-backend \
libqt5-sql-postgresql"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Sql.so.5 \
libQt5Sql5 \
libc.so.6 \
libpq.so.5 \
libstdc++.so.6"

inherit rpm
