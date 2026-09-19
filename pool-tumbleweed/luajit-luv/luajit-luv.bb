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

RPM_NAME = "luajit-luv-1.51.0+1-7.3.aarch64.rpm"
RPM_HASH = "c67f9cfc9dd039825253dbf3e1b7a78c35121ab6ed3d84233cfff2ad6f5de8fddd5987b7d8d871a7234173e5841abc7bef71ad80804d8f7ab7da52519ae04c6c"

RPROVIDES:${PN} += "luajit-luv"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libluajit-5.1.so.2 \
libuv.so.1 \
luajit"

inherit rpm
