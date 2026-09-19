SUMMARY = "A utf-8 support module for Lua and LuaJIT"
DESCRIPTION = "This module adds UTF-8 support to Lua. It use data extracted from \
Unicode Character Database, and tested on Lua 5.2.3, Lua 5.3.0 and LuaJIT. \
parseucd.lua is a pure Lua script generate unidata.h, to support convert \
characters and check characters' category. It mainly used to compatible \
with Lua's own string module, it passed all string and pattern matching \
test in lua test suite2."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "lua54-luautf8-0.2.0-1.3.aarch64.rpm"
RPM_HASH = "2424028a62baa7db09e86593847ea63c9ee120e55caf17d741b83e196cac49567e7089dea191e0650061e713339c4846773ea72d704daa87747688ad3d1071c4"

RPROVIDES:${PN} += "lua-luautf8 \
lua54-luautf8"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
lua54"

inherit rpm
