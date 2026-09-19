SUMMARY = "ODBC driver for SQLite"
DESCRIPTION = "ODBC driver for SQLite interfacing SQLite 3.x using the \
unixODBC or iODBC driver managers. For more information refer to \
http://www.sqlite.org    -  SQLite engine \
http://www.unixodbc.org  -  unixODBC Driver Manager \
http://www.iodbc.org     -  iODBC Driver Manager"
LICENSE = "BSD-2-Clause"

PV = "0.99991"

RPM_NAME = "sqliteodbc-0.99991-2.8.aarch64.rpm"
RPM_HASH = "79c5d5808bb54b4901239c59b02a7d3dfacd6a9ce77861f865e14ff8bc47b7657be4de530803a599199912289396586d500955e59dca27470ae515f245406f0f"

RPROVIDES:${PN} += "libsqlite3-mod-blobtoxy-0.99991.so \
libsqlite3-mod-csvtable-0.99991.so \
libsqlite3-mod-impexp-0.99991.so \
libsqlite3-mod-xpath-0.99991.so \
libsqlite3-mod-zipfile-0.99991.so \
libsqlite3odbc-0.99991.so \
sqliteodbc"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsqlite3.so.0 \
libxml2.so.16 \
libz.so.1 \
unixODBC"

inherit rpm
