SUMMARY = "A utf-8 support module for Lua and LuaJIT"
DESCRIPTION = "This module adds UTF-8 support to Lua. It use data extracted from \
Unicode Character Database, and tested on Lua 5.2.3, Lua 5.3.0 and LuaJIT. \
parseucd.lua is a pure Lua script generate unidata.h, to support convert \
characters and check characters' category. It mainly used to compatible \
with Lua's own string module, it passed all string and pattern matching \
test in lua test suite2."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "luajit-luautf8-0.2.0-1.3.aarch64.rpm"
RPM_HASH = "37af6cb1dfa47c6aabf3fe72462a53eb629b8ea4b4522fdbea64483d54cb5fda47edc8a5cbcb8fa51e6797b0e87d27e3881255933c17db300ee46834bb809bb3"

RPROVIDES:${PN} += "luajit-luautf8"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
luajit"

inherit rpm
