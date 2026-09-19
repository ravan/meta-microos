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

RPM_NAME = "lua53-luadbi-0.7.5-2.3.aarch64.rpm"
RPM_HASH = "f4a374a897968128880b868606ec1f0d0683d2315402a04d86874b4d02be357d4b285fcf24a8f3a0c89937ce085c5e7f79c156f266609328029cfe3344bdc8dc"

RPROVIDES:${PN} += "lua53-luadbi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmariadb.so.3 \
libpq.so.5 \
libsqlite3.so.0 \
lua53"

inherit rpm
