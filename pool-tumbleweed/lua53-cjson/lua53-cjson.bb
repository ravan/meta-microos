SUMMARY = "Lua JSON Encoding/Decoding"
DESCRIPTION = "This is the Lua extension package for JSON encoding/decoding."
LICENSE = "MIT"

PV = "2.1.0.16"

RPM_NAME = "lua53-cjson-2.1.0.16-1.3.aarch64.rpm"
RPM_HASH = "632d24f5580ad676dd63caaa68928507bdeab758dcaf7b312bc65dc84c689ca1ba8ffc8aa259fd50533bdf382136c483d753cc1fc9a115629fb8c326f2499770"

RPROVIDES:${PN} += "lua53-cjson"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
lua53"

inherit rpm
