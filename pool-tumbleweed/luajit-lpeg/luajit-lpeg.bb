SUMMARY = "Parsing Expression Grammars For Lua"
DESCRIPTION = "LPeg is a new pattern-matching library for Lua, based on Parsing Expression Grammars (PEGs)."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "luajit-lpeg-1.1.0-3.4.aarch64.rpm"
RPM_HASH = "1f30ab18808aeae987ebfc545b2fa8abf3723a053ddf184cd1d4063cc373f6221f270113f42d3d49a2736c4eefde4d92eb1fba8784ded295e5ba02fc3d679213"

RPROVIDES:${PN} += "luajit-LPeg \
luajit-lpeg"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
luajit"

inherit rpm
