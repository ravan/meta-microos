SUMMARY = "Simple streaming interface to zlib for Lua"
DESCRIPTION = "lua-zlib is a simple streaming interface to zlib for Lua."
LICENSE = "MIT | X11"

PV = "1.4"

RPM_NAME = "lua54-zlib-1.4-1.3.aarch64.rpm"
RPM_HASH = "9289bdd7568bc86ddabc64c7da7bc408efde18c4baa2c293595ab8af0a47297b61a1d40ffe68f801737e922b2b187fb07bef21a12f4919f2c215530090ee062e"

RPROVIDES:${PN} += "lua-zlib \
lua54-zlib"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
liblua5.4.so.5 \
libz.so.1 \
lua54"

inherit rpm
