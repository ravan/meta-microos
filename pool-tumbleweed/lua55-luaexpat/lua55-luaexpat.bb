SUMMARY = "A SAX XML parser based on the Expat library"
DESCRIPTION = "LuaExpat is a SAX XML parser based on the Expat library."
LICENSE = "MIT"

PV = "1.5.1"

RPM_NAME = "lua55-luaexpat-1.5.1-4.3.aarch64.rpm"
RPM_HASH = "4c64a8de0d7d3fe49f304c21e9da0db054eb100a472936b165469fa0678a146aa5a116a6a016d93e3fb7c733511bbfd803a5be685e258bc61b33c83892b43fb4"

RPROVIDES:${PN} += "lua55-luaexpat"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libexpat.so.1 \
lua55"

inherit rpm
