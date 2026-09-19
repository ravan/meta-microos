SUMMARY = "Implementation of MessagePack for Lua 5.1"
DESCRIPTION = "mpack is a binary serialization/RPC library that implements both the msgpack \
and msgpack-rpc specifications."
LICENSE = "MIT"

PV = "1.0.13"

RPM_NAME = "lua55-mpack-1.0.13-2.3.aarch64.rpm"
RPM_HASH = "8b05b80310316fa55cfc947f514b01b32d838970c96bb0180e3206a5364c539cbd963e22dce9e7b265fef7761500faf5c316a8717b4dfdbd138b1825172ecea8"

RPROVIDES:${PN} += "lua55-mpack"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
lua55"

inherit rpm
