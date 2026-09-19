SUMMARY = "A utf-8 support module for Lua and LuaJIT"
DESCRIPTION = "This module adds UTF-8 support to Lua. It use data extracted from \
Unicode Character Database, and tested on Lua 5.2.3, Lua 5.3.0 and LuaJIT. \
parseucd.lua is a pure Lua script generate unidata.h, to support convert \
characters and check characters' category. It mainly used to compatible \
with Lua's own string module, it passed all string and pattern matching \
test in lua test suite2."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "lua53-luautf8-0.2.0-1.3.aarch64.rpm"
RPM_HASH = "d715e7e384780c035ee3baf60d4dfff55c085e8221984938fedba62fd9f87cd61dc517d63d477b7588b0f804b0645637da8ec7fd3714f881fb8ff332524642d1"

RPROVIDES:${PN} += "lua53-luautf8"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
lua53"

inherit rpm
