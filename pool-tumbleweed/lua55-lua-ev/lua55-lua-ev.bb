SUMMARY = "Lua integration with libev"
DESCRIPTION = "Lua integration with libev (http://dist.schmorp.de/libev)"
LICENSE = "MIT"

PV = "1.5"

RPM_NAME = "lua55-lua-ev-1.5-7.3.aarch64.rpm"
RPM_HASH = "64061a8add77afa83743f3ba241f7054b28be4c7f0c125ba6c8fa6d8b12bfc65bc3a07d86b5dba47717b9e4524716ce2153d537e9ea9ab5c994f51fa80871b52"

RPROVIDES:${PN} += "lua55-lua-ev"

RDEPENDS:${PN} += "libc.so.6 \
libev.so.4 \
liblua5.5.so.5 \
lua55"

inherit rpm
