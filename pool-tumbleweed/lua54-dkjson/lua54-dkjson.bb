SUMMARY = "David Kolf's JSON module for Lua"
DESCRIPTION = "dkjson is a module for encoding and decoding JSON data. It \
supports UTF-8. \
 \
JSON (JavaScript Object Notation) is a format for serializing \
data based on the syntax for JavaScript data structures. \
 \
dkjson is written in Lua without any dependencies, but \
when LPeg is available dkjson can use it to speed up decoding."
LICENSE = "MIT"

PV = "2.8.0"

RPM_NAME = "lua54-dkjson-2.8.0-3.2.noarch.rpm"
RPM_HASH = "0a3e64a301191ec5e00ace30fafa14814d9001f20bc59119e698fc8b7d0ec81918efe0d2c11b5939247b3ffe11773597b72cc5609c646b36285ae68eb9bae65b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua-dkjson \
lua54-dkjson"

RDEPENDS:${PN} += "lua54 \
lua54-lpeg"

inherit rpm
