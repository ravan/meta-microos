SUMMARY = "Parsing Expression Grammars For Lua"
DESCRIPTION = "LPeg is a new pattern-matching library for Lua, based on Parsing Expression Grammars (PEGs)."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "lua53-lpeg-1.1.0-3.4.aarch64.rpm"
RPM_HASH = "834df8173bf0ef9142d917937c5aa163b13a8ce924006686218115876ca27fe5b1e237c536c7e514001f82a3ad13db013bba5fa6b511c36f59fd047c74c886cd"

RPROVIDES:${PN} += "lua53-LPeg \
lua53-lpeg"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
lua53"

inherit rpm
