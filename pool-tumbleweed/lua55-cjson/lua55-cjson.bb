SUMMARY = "Lua JSON Encoding/Decoding"
DESCRIPTION = "This is the Lua extension package for JSON encoding/decoding."
LICENSE = "MIT"

PV = "2.1.0.16"

RPM_NAME = "lua55-cjson-2.1.0.16-1.3.aarch64.rpm"
RPM_HASH = "eda02adcda22270f5a868ce963e4062571f82d25d4b5f2cd8fe3e49a4582c9e3f834b958fa08ed60abf38aaf30a2c54856f3b9f3fa470570cbeb9263c9d33867"

RPROVIDES:${PN} += "lua55-cjson"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
lua55"

inherit rpm
