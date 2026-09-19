SUMMARY = "Parsing Expression Grammars For Lua"
DESCRIPTION = "LPeg is a new pattern-matching library for Lua, based on Parsing Expression Grammars (PEGs)."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "lua54-lpeg-1.1.0-3.4.aarch64.rpm"
RPM_HASH = "d25554b7e911510afddc828355198c6c60d04f472b86baf0ddc2d29f49acfebdc4f3d67e6a03fb42219341b08ec89998aa5c36f2a27b81f7a1b44c8f3d1f708d"

RPROVIDES:${PN} += "lua-lpeg \
lua54-LPeg \
lua54-lpeg"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
lua54"

inherit rpm
