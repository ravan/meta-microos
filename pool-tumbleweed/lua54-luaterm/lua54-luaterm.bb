SUMMARY = "Terminal operations for Lua"
DESCRIPTION = "This package provides terminal operations for Lua"
LICENSE = "MIT"

PV = "0.07"

RPM_NAME = "lua54-luaterm-0.07-10.3.aarch64.rpm"
RPM_HASH = "4b4e07204248e976e8ff10da28a361e581160b3edc3969241a001c69039186d27790c2b773aef0ac86ec0ab56b6990d3cb32654c8272ef066f14043ba8af50ac"

RPROVIDES:${PN} += "lua-luaterm \
lua54-luaterm"

RDEPENDS:${PN} += "libc.so.6 \
lua54"

inherit rpm
