SUMMARY = "Qt 6 SQLite plugin"
DESCRIPTION = "A plugin to access SQLite databases in Qt applications. \
 \
SQLite is an in-process database, which means that it is not \
necessary to have a database server. SQLite operates on a single \
file, which must be set as the database name when opening a \
connection."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-sql-sqlite-6.11.2-2.1.aarch64.rpm"
RPM_HASH = "00c45d963afd5a88f5bfe214f2ed079223a5a93f3a400d39ccdd9e411fce2b338939d67db03129c2511dd581a26749c9275f4658e83c685bc10e1e54f8fd52a6"

RPROVIDES:${PN} += "libqsqlite.so \
qt6-sql-sqlite"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Sql.so.6 \
libQt6Sql6 \
libc.so.6 \
libsqlite3.so.0 \
libstdc++.so.6"

inherit rpm
