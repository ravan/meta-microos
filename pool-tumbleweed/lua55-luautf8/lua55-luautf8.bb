SUMMARY = "A utf-8 support module for Lua and LuaJIT"
DESCRIPTION = "This module adds UTF-8 support to Lua. It use data extracted from \
Unicode Character Database, and tested on Lua 5.2.3, Lua 5.3.0 and LuaJIT. \
parseucd.lua is a pure Lua script generate unidata.h, to support convert \
characters and check characters' category. It mainly used to compatible \
with Lua's own string module, it passed all string and pattern matching \
test in lua test suite2."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "lua55-luautf8-0.2.0-1.3.aarch64.rpm"
RPM_HASH = "40d40b3f3ecd59d468f6ab022d109bd3c977c05b8767559f548ebeac912b212a371c44f3a7467d072b1155347e97a3a3f44a0a9424c664488854e80285f1d0bf"

RPROVIDES:${PN} += "lua55-luautf8"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
lua55"

inherit rpm
