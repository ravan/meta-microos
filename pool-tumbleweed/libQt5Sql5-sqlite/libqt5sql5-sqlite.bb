SUMMARY = "Qt 5 sqlite plugin"
DESCRIPTION = "The Qt SQL module uses driver plugins to communicate with the \
different database APIs. \
 \
The Qt SQLite plugin makes it possible to access SQLite databases. \
SQLite is an in-process database, which means that it is not \
necessary to have a database server. SQLite operates on a single \
file, which must be set as the database name when opening a \
connection."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.19+kde96"

RPM_NAME = "libQt5Sql5-sqlite-5.15.19+kde96-1.3.aarch64.rpm"
RPM_HASH = "a8cd74ca450ddc3a2f664a4c5dc24cd2d64397fd949090cb0ce0d374b1b0d52380a0af02b46f9c118dea28460ee31f5156383500d144911ad803dcf47f6ba2b4"

RPROVIDES:${PN} += "libQt5Sql5-sqlite \
libqsqlite.so \
libqt5-sql-backend \
libqt5-sql-sqlite"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Sql.so.5 \
libQt5Sql5 \
libc.so.6 \
libsqlite3.so.0 \
libstdc++.so.6"

inherit rpm
