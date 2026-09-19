SUMMARY = "Parsing Expression Grammars For Lua"
DESCRIPTION = "LPeg is a new pattern-matching library for Lua, based on Parsing Expression Grammars (PEGs)."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "lua55-lpeg-1.1.0-3.4.aarch64.rpm"
RPM_HASH = "0431ac7a989ddfa1cf145e911596e0aba57209f4edcb4fa19be271f17bd46a88d9da621b0ef802425b59d6de862971b6eca774a6cad54038fed090c568edc90e"

RPROVIDES:${PN} += "lua55-LPeg \
lua55-lpeg"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
lua55"

inherit rpm
