SUMMARY = "A binding of libevent to Lua"
DESCRIPTION = "This is a binding of libevent to Lua. It will serve as a drop-in \
replacement for copas, and eventually support more features \
(async DNS, HTTP, RPC...)."
LICENSE = "MIT"

PV = "0.4.6"

RPM_NAME = "lua53-luaevent-0.4.6-6.3.aarch64.rpm"
RPM_HASH = "b97afe2bc833f6e7c8058db1f2eba0f6eb8b6d19aa1362da88f016743a614b0163d42a3676051698faf254a6f6dca0419188bd73fd78b3d612f6085c5aca2871"

RPROVIDES:${PN} += "lua53-event \
lua53-luaevent"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libevent-2.1.so.7 \
lua53 \
lua53-luasocket"

inherit rpm
