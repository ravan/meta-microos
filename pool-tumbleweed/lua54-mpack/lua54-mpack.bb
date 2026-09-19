SUMMARY = "Implementation of MessagePack for Lua 5.1"
DESCRIPTION = "mpack is a binary serialization/RPC library that implements both the msgpack \
and msgpack-rpc specifications."
LICENSE = "MIT"

PV = "1.0.13"

RPM_NAME = "lua54-mpack-1.0.13-2.3.aarch64.rpm"
RPM_HASH = "365d521d1cf66b59cb1340c4891acc7efff2aae754763d2dde41a62db103793b182680474f777dc1fb5a7b908644803810af793812950f331f1cd60c69c2bcba"

RPROVIDES:${PN} += "lua-mpack \
lua54-mpack"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
lua54"

inherit rpm
