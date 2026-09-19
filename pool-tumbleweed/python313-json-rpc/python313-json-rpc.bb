SUMMARY = "JSON-RPC transport implementation"
DESCRIPTION = "JSON-RPC 2.0 and JSON-RPC 1.0 transport specification implementation. \
 \
This implementation does not have any transport functionality \
realization, only protocol. Any client or server implementation is \
easy based on current code, but requires transport libraries, such as \
requests, gevent or zmq."
LICENSE = "MIT"

PV = "1.15.0"

RPM_NAME = "python313-json-rpc-1.15.0-2.5.noarch.rpm"
RPM_HASH = "5e9603f7d26882e5ca277a02f6b61e7978bfa6958a8f8b78f6ec5c82c1a4ab8d0b6226ddffd4348e12869a9e612e12251d02b60b4f6ab4fb8c68254061b05d2b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-json-rpc \
python3.13dist-json-rpc \
python313-json-rpc \
python3dist-json-rpc"

RDEPENDS:${PN} += "python-abi"

inherit rpm
