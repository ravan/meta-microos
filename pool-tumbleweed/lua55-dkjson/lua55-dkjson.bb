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

RPM_NAME = "lua55-dkjson-2.8.0-3.2.noarch.rpm"
RPM_HASH = "0574cce1272dcd4dedae69da64b972a2d0092a64ae7a86da274f993d198c822c7c4a1df689ee71e7fecfb6f9a2d1fe4cad4bf35cc11e72e459bb43ffd90e7b40"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua55-dkjson"

RDEPENDS:${PN} += "lua55 \
lua55-lpeg"

inherit rpm
