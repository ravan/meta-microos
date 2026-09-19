SUMMARY = "Terminal operations for Lua"
DESCRIPTION = "This package provides terminal operations for Lua"
LICENSE = "MIT"

PV = "0.07"

RPM_NAME = "lua55-luaterm-0.07-10.3.aarch64.rpm"
RPM_HASH = "41c47bdb0e72bc008675521f786fd38501bdf826d1654a355e541b5bb8c0bd44392cf6ef9daf1f0210c0e035744a5c281d219dbd72877d340919b7eb45696fa4"

RPROVIDES:${PN} += "lua55-luaterm"

RDEPENDS:${PN} += "libc.so.6 \
lua55"

inherit rpm
