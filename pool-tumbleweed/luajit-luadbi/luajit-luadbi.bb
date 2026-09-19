SUMMARY = "A database interface library for Lua"
DESCRIPTION = "LuaDBI is a database interface library for Lua. It is designed to provide a \
RDBMS agnostic API for handling database operations. LuaDBI also provides \
support for prepared statement handles, placeholders and bind parameters for \
all database operations. \
 \
Currently LuaDBI supports DB2, Oracle, MySQL, PostgreSQL and SQLite databases \
with native database drivers. But openSUSE version doesn't build with DB2 and \
Oracle."
LICENSE = "MIT"

PV = "0.7.5"

RPM_NAME = "luajit-luadbi-0.7.5-2.3.aarch64.rpm"
RPM_HASH = "025b6db4e2f7519736cd1da26744008911b683406fe629cece2c2f49fd3fa162e34e8995332b4e4afcfbf2bd099fe0e72f1e281bd88dbc078c087ff4ade9e2e2"

RPROVIDES:${PN} += "luajit-luadbi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmariadb.so.3 \
libpq.so.5 \
libsqlite3.so.0 \
luajit"

inherit rpm
