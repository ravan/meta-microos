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

RPM_NAME = "lua55-luv-1.51.0+1-7.3.aarch64.rpm"
RPM_HASH = "01e2753ef3c8f63a3a35706d9bc80e45eb6579969865a11deb88d65062e44be96dc09d43e99a898f38226c2b33812e546cba95cfdcaf027fb4e32f3ab06d6afc"

RPROVIDES:${PN} += "lua55-luv"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liblua5.5.so.5 \
libuv.so.1 \
lua55"

inherit rpm
