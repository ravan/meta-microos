SUMMARY = "Lua-5.3-style APIs for Lua 5.2 and 5.1"
DESCRIPTION = "This package provides terminal operations for Lua"
LICENSE = "MIT"

PV = "0.14.4"

RPM_NAME = "luajit-compat-5.3-0.14.4-13.4.aarch64.rpm"
RPM_HASH = "5186f023b4594ae5d41e6ff92e15fca0551d5f5c238ce357bc535281b4bd1e71b9e043ae5df59adcba7dfe085dd54e7ca9e98627ffcd45da6267ea052dbd253d"

RPROVIDES:${PN} += "luajit-compat-5.3"

RDEPENDS:${PN} += "libc.so.6 \
luajit \
luajit-bit32"

inherit rpm
