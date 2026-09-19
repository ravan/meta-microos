SUMMARY = "A binding of libevent to Lua"
DESCRIPTION = "This is a binding of libevent to Lua. It will serve as a drop-in \
replacement for copas, and eventually support more features \
(async DNS, HTTP, RPC...)."
LICENSE = "MIT"

PV = "0.4.6"

RPM_NAME = "luajit-luaevent-0.4.6-6.3.aarch64.rpm"
RPM_HASH = "c8bb4610ea83c103148a0a743ed501ad9a096b6c1281431ee8148b102b8d2cf9680c52e26145f92411a95134c26a377d1cb44f7969fe6ec86367ad9d78cc9635"

RPROVIDES:${PN} += "luajit-event \
luajit-luaevent"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libevent-2.1.so.7 \
luajit \
luajit-luasocket"

inherit rpm
