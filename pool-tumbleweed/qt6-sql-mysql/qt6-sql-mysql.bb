SUMMARY = "Qt 6 MySQL support"
DESCRIPTION = "A plugin to access MySQL servers in Qt applications."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-sql-mysql-6.11.2-2.1.aarch64.rpm"
RPM_HASH = "60e14f3f8d9b0ba8997abec8b655a1b5c5b53b3d25a6cd2534c3dc49cd65d50a2a95c8dfa8bad9d8c3dda614bb6b23b40ca33ca02b8d4995fe56359c8e69ff80"

RPROVIDES:${PN} += "libqsqlmysql.so \
qt6-sql-mysql"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Sql.so.6 \
libQt6Sql6 \
libc.so.6 \
libmariadb.so.3 \
libstdc++.so.6"

inherit rpm
