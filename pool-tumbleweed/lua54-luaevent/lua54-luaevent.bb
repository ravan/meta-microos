SUMMARY = "A binding of libevent to Lua"
DESCRIPTION = "This is a binding of libevent to Lua. It will serve as a drop-in \
replacement for copas, and eventually support more features \
(async DNS, HTTP, RPC...)."
LICENSE = "MIT"

PV = "0.4.6"

RPM_NAME = "lua54-luaevent-0.4.6-6.3.aarch64.rpm"
RPM_HASH = "6f86c94a4a80aed4a16586e106482817c21f102cdcee1da8619e9a9df118e6d2fa5206cdf807730fd6e04478968558b7ec5717476ab344b80f740a1dd4d14ff3"

RPROVIDES:${PN} += "lua-luaevent \
lua54-event \
lua54-luaevent"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libevent-2.1.so.7 \
lua54 \
lua54-luasocket"

inherit rpm
