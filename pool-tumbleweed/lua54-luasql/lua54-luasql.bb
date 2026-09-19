SUMMARY = "Simple interface from Lua to a DBMS"
DESCRIPTION = "A simple interface from Lua to a DBMS. It enables a Lua program to: \
 - Connect to ODBC, ADO, Oracle, MySQL, SQLite and PostgreSQL databases; \
 - Execute arbitrary SQL statements; \
 - Retrieve results in a row-by-row cursor fashion."
LICENSE = "MIT"

PV = "2.7.0"

RPM_NAME = "lua54-luasql-2.7.0-3.5.aarch64.rpm"
RPM_HASH = "72d87e77ea4c3dca102131213c2fdf687ad31f5402e1e53381d1d45481ca207869af99c49851e01219e26ce89289acc07eebc57d0222f56af1d10393d8752671"

RPROVIDES:${PN} += "lua-luasql \
lua54-luasql"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libiodbc.so.2 \
libmariadb.so.3 \
libmariadb3 \
libpq.so.5 \
libsqlite3.so.0 \
lua54"

inherit rpm
