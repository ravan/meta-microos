SUMMARY = "Simple streaming interface to zlib for Lua"
DESCRIPTION = "lua-zlib is a simple streaming interface to zlib for Lua."
LICENSE = "MIT | X11"

PV = "1.4"

RPM_NAME = "luajit-zlib-1.4-1.3.aarch64.rpm"
RPM_HASH = "dbc0361661b47ba5ce91e7589ebdc062fb71af6bdf6879819b650f597f07a1ef862c7b73fdc389616fe2db33a6c4b43e573e60d885acd9a5d6ce60e4002bd50b"

RPROVIDES:${PN} += "luajit-zlib"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libluajit-5.1.so.2 \
libz.so.1 \
luajit"

inherit rpm
