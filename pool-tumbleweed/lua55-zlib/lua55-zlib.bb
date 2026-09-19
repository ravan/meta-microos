SUMMARY = "Simple streaming interface to zlib for Lua"
DESCRIPTION = "lua-zlib is a simple streaming interface to zlib for Lua."
LICENSE = "MIT | X11"

PV = "1.4"

RPM_NAME = "lua55-zlib-1.4-1.3.aarch64.rpm"
RPM_HASH = "ccdeb78ae4139381ee4db2bfc998a55dfa77d4ecb78463806a8ebe7342983fd4e960d5c10c7da33e9be8ba2f1f8941c5cd0643e936911a562d6184991d38a10d"

RPROVIDES:${PN} += "lua55-zlib"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
liblua5.5.so.5 \
libz.so.1 \
lua55"

inherit rpm
