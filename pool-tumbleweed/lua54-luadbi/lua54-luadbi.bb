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

RPM_NAME = "lua54-luadbi-0.7.5-2.3.aarch64.rpm"
RPM_HASH = "5150c98d171f41d9ba597e0d6ccf57ae36f4a2edd12743f71bbd50a860ff762f12d1ba4eaea15d7fd5a6ac01b11d95d6734e37458b28fb9a7e4d4cd620cb2056"

RPROVIDES:${PN} += "lua-luadbi \
lua54-luadbi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmariadb.so.3 \
libpq.so.5 \
libsqlite3.so.0 \
lua54"

inherit rpm
