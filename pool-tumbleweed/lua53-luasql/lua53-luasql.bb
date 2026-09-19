SUMMARY = "Simple interface from Lua to a DBMS"
DESCRIPTION = "A simple interface from Lua to a DBMS. It enables a Lua program to: \
 - Connect to ODBC, ADO, Oracle, MySQL, SQLite and PostgreSQL databases; \
 - Execute arbitrary SQL statements; \
 - Retrieve results in a row-by-row cursor fashion."
LICENSE = "MIT"

PV = "2.7.0"

RPM_NAME = "lua53-luasql-2.7.0-3.5.aarch64.rpm"
RPM_HASH = "8163588c6366ea0f5cd6fe47888e343e9c42b9e2557d72c80e9b4da204ce0abd919e23ba5db64b9025929055997177e92039cd929c892165a290e7dbb335bbc7"

RPROVIDES:${PN} += "lua53-luasql"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libiodbc.so.2 \
libmariadb.so.3 \
libmariadb3 \
libpq.so.5 \
libsqlite3.so.0 \
lua53"

inherit rpm
