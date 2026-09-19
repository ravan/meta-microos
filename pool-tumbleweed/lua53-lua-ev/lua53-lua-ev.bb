SUMMARY = "Lua integration with libev"
DESCRIPTION = "Lua integration with libev (http://dist.schmorp.de/libev)"
LICENSE = "MIT"

PV = "1.5"

RPM_NAME = "lua53-lua-ev-1.5-7.3.aarch64.rpm"
RPM_HASH = "ae7753ffd8a093e856d5ec1214be8853bd8595a1b33ed6e3f1eb9bf068e5d90016da547cbf8c7dcab709c1d04168ba893d178440c18d3e3ce47b5f5f263a0090"

RPROVIDES:${PN} += "lua53-lua-ev"

RDEPENDS:${PN} += "libc.so.6 \
libev.so.4 \
liblua5.3.so.5 \
lua53"

inherit rpm
