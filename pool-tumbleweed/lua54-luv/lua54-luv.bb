SUMMARY = "Bare libuv bindings for lua"
DESCRIPTION = "This library makes libuv available to lua scripts. It was made \
for the luvit project but should usable from nearly any lua \
project. \
 \
The library can be used by multiple threads at once. Each thread \
is assumed to load the library from a different lua_State. Luv \
will create a unique uv_loop_t for each state. You can't share uv \
handles between states/loops. \
 \
The best docs currently are the libuv docs themselves. Hopfully \
soon we'll have a copy locally tailored for lua."
LICENSE = "Apache-2.0"

PV = "1.51.0+1"

RPM_NAME = "lua54-luv-1.51.0+1-7.3.aarch64.rpm"
RPM_HASH = "04123d21df2c6b33a3c7d89241e34be90e8e0c342f50ecc776b1608c8a714ae3f43ed842dec9f1399a80f079962e14354317fd02888f4b27a2433021c289f87f"

RPROVIDES:${PN} += "lua-luv \
lua54-luv"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liblua5.4.so.5 \
libuv.so.1 \
lua54"

inherit rpm
