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

RPM_NAME = "lua55-luadbi-0.7.5-2.3.aarch64.rpm"
RPM_HASH = "313d4bf11a94541d826b6f03913080b3fe60cc5dba7cc5a85b0c6b9037d1e5eb4c0a5b2f96fa044f47e04e401e5c9b5b4a9505301603c5d831732fccbcbb3a03"

RPROVIDES:${PN} += "lua55-luadbi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmariadb.so.3 \
libpq.so.5 \
libsqlite3.so.0 \
lua55"

inherit rpm
