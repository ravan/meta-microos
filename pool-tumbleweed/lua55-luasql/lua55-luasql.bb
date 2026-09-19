SUMMARY = "Simple interface from Lua to a DBMS"
DESCRIPTION = "A simple interface from Lua to a DBMS. It enables a Lua program to: \
 - Connect to ODBC, ADO, Oracle, MySQL, SQLite and PostgreSQL databases; \
 - Execute arbitrary SQL statements; \
 - Retrieve results in a row-by-row cursor fashion."
LICENSE = "MIT"

PV = "2.7.0"

RPM_NAME = "lua55-luasql-2.7.0-3.5.aarch64.rpm"
RPM_HASH = "0edbb24518300ca605de4ceb47863299d708c4fe0f3a2f4f60647a898d3a9a3fd81c0ef14423ac4c597f963359767b3c6ebfec7c410ff37229a53c08792352ba"

RPROVIDES:${PN} += "lua55-luasql"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libiodbc.so.2 \
libmariadb.so.3 \
libmariadb3 \
libpq.so.5 \
libsqlite3.so.0 \
lua55"

inherit rpm
