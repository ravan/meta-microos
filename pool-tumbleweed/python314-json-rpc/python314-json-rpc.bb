SUMMARY = "JSON-RPC transport implementation"
DESCRIPTION = "JSON-RPC 2.0 and JSON-RPC 1.0 transport specification implementation. \
 \
This implementation does not have any transport functionality \
realization, only protocol. Any client or server implementation is \
easy based on current code, but requires transport libraries, such as \
requests, gevent or zmq."
LICENSE = "MIT"

PV = "1.15.0"

RPM_NAME = "python314-json-rpc-1.15.0-2.5.noarch.rpm"
RPM_HASH = "500b7233e04a6a39f14572035060e1f78a4ea2898f39086e45e01e930b4dd5e4c5c82ffb07b1f22b3ab729cc3b0a1da3df345d570da45f49c47726df455ee133"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-json-rpc \
python314-json-rpc \
python3dist-json-rpc"

RDEPENDS:${PN} += "python-abi"

inherit rpm
