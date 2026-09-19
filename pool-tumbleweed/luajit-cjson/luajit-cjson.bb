SUMMARY = "Lua JSON Encoding/Decoding"
DESCRIPTION = "This is the Lua extension package for JSON encoding/decoding."
LICENSE = "MIT"

PV = "2.1.0.16"

RPM_NAME = "luajit-cjson-2.1.0.16-1.3.aarch64.rpm"
RPM_HASH = "7b0df1833423d2c8b48b5794d747054c1744b5f184a05bffd058f5360c42bdbeaec61359ab0455e402974a6302667bde473e9e0e0ff6ba1a05df98cd70ee0e87"

RPROVIDES:${PN} += "luajit-cjson"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
luajit"

inherit rpm
