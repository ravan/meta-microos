SUMMARY = "Simple streaming interface to zlib for Lua"
DESCRIPTION = "lua-zlib is a simple streaming interface to zlib for Lua."
LICENSE = "MIT | X11"

PV = "1.4"

RPM_NAME = "lua53-zlib-1.4-1.3.aarch64.rpm"
RPM_HASH = "4dc1f190a186d214ecdd413e3497626717ec7f1a9a4079fa534e332fffc49d6d7e65b50ae6387b10af23d127e992701a9a0ec8cbd1662df4fb4648c61aa7d093"

RPROVIDES:${PN} += "lua53-zlib"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
liblua5.3.so.5 \
libz.so.1 \
lua53"

inherit rpm
