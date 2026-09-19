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

RPM_NAME = "lua53-dkjson-2.8.0-3.2.noarch.rpm"
RPM_HASH = "455d7f111c6c26e197156fd0abe0124e2b5e20974d9183b0ff283f88ae0f775f422d73be3eb362a89ea8568847a417c1a2d0901be267b8845d1fda3a8b5e9687"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua53-dkjson"

RDEPENDS:${PN} += "lua53 \
lua53-lpeg"

inherit rpm
