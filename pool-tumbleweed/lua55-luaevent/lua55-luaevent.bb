SUMMARY = "A binding of libevent to Lua"
DESCRIPTION = "This is a binding of libevent to Lua. It will serve as a drop-in \
replacement for copas, and eventually support more features \
(async DNS, HTTP, RPC...)."
LICENSE = "MIT"

PV = "0.4.6"

RPM_NAME = "lua55-luaevent-0.4.6-6.3.aarch64.rpm"
RPM_HASH = "6d94802a6b69cf4ba03c67dbc5aedc412166c2e706f4f17e8ed7649d3f2be3191c1ccb729acdd00ecf68f1c0c9451affef7d4d60763d8ce319932629bc5aed05"

RPROVIDES:${PN} += "lua55-event \
lua55-luaevent"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libevent-2.1.so.7 \
lua55 \
lua55-luasocket"

inherit rpm
