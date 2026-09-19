SUMMARY = "Implementation of MessagePack for Lua 5.1"
DESCRIPTION = "mpack is a binary serialization/RPC library that implements both the msgpack \
and msgpack-rpc specifications."
LICENSE = "MIT"

PV = "1.0.13"

RPM_NAME = "lua53-mpack-1.0.13-2.3.aarch64.rpm"
RPM_HASH = "b005ae8b58c51a8ab91543c43427ecc91da7a03e709cd857e484cac80d89429d436e81f634f20f92e7743670afa4d3217681c50dcf39fd9375c0191bd8d95fe0"

RPROVIDES:${PN} += "lua53-mpack"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
lua53"

inherit rpm
