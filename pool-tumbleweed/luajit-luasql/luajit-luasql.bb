SUMMARY = "Simple interface from Lua to a DBMS"
DESCRIPTION = "A simple interface from Lua to a DBMS. It enables a Lua program to: \
 - Connect to ODBC, ADO, Oracle, MySQL, SQLite and PostgreSQL databases; \
 - Execute arbitrary SQL statements; \
 - Retrieve results in a row-by-row cursor fashion."
LICENSE = "MIT"

PV = "2.7.0"

RPM_NAME = "luajit-luasql-2.7.0-3.5.aarch64.rpm"
RPM_HASH = "fddb9cc9f5f5677e357ee216666b4cf2d5f8326f592e98fd7aa3f7cc0c076cc96e7e7e40c20a4771678b3cb58cf05ff55200ff54d8cad4725c81d6650e450f6d"

RPROVIDES:${PN} += "luajit-luasql"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libiodbc.so.2 \
libmariadb.so.3 \
libmariadb3 \
libpq.so.5 \
libsqlite3.so.0 \
luajit"

inherit rpm
