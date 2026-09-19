SUMMARY = "Lua JSON Encoding/Decoding"
DESCRIPTION = "This is the Lua extension package for JSON encoding/decoding."
LICENSE = "MIT"

PV = "2.1.0.16"

RPM_NAME = "lua54-cjson-2.1.0.16-1.3.aarch64.rpm"
RPM_HASH = "b67976e87adccf4455cce36f8bc38cfb12e927d3379da06262f6eeaa9f379d772cb33dd7ada89e67d6c485068a9d0d1ee0ab758477652e2d0c22992881fc5492"

RPROVIDES:${PN} += "lua-cjson \
lua54-cjson"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
lua54"

inherit rpm
