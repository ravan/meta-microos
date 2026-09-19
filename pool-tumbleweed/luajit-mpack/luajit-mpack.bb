SUMMARY = "Implementation of MessagePack for Lua 5.1"
DESCRIPTION = "mpack is a binary serialization/RPC library that implements both the msgpack \
and msgpack-rpc specifications."
LICENSE = "MIT"

PV = "1.0.13"

RPM_NAME = "luajit-mpack-1.0.13-2.3.aarch64.rpm"
RPM_HASH = "1f6fd6f7a8bb30b6965a349ee97deaa88cf596101c1a160fb27320c746ef9cdae214ea949c322c950278de18287783e10fd1b6bc75ef4de19559dca1a6219f23"

RPROVIDES:${PN} += "luajit-mpack"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
luajit"

inherit rpm
