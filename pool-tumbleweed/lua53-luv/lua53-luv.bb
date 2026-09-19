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

RPM_NAME = "lua53-luv-1.51.0+1-7.3.aarch64.rpm"
RPM_HASH = "5f27b867f421848e75afc85f3d9ea9b931ed0a885122c38bd80e968c4cacb853cc2977c5d411c806e973d907258748cbe5ec85ed10e45374e22797e61c65f2b2"

RPROVIDES:${PN} += "lua53-luv"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liblua5.3.so.5 \
libuv.so.1 \
lua53"

inherit rpm
