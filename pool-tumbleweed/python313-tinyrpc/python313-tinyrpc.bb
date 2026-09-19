SUMMARY = "A modular transport and protocol neutral RPC library"
DESCRIPTION = "There are a number of jsonrpc libraries already out there on PyPI, \
most of them handling one specific use case (e.g. JSON via WSGI, \
using Twisted, or TCP sockets). \
 \
None of the libraries, however, made it easy for the author of \
TinyRPC to reuse the jsonrpc-parsing bits and substitute a different \
transport (i.e. going from json via TCP to an implementation using \
WebSockets or ZeroMQ)."
LICENSE = "MIT"

PV = "1.1.7"

RPM_NAME = "python313-tinyrpc-1.1.7-2.5.noarch.rpm"
RPM_HASH = "2c397d764b9b1ed30e64f12a1d1e37e16505cc3634c393dd2e4150a8551c3a469775675cc8d944f009fa5ce0a1d3a64973460ee7209510da183f142a7d24206c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-tinyrpc \
python3.13dist-tinyrpc \
python313-tinyrpc \
python3dist-tinyrpc"

RDEPENDS:${PN} += "python-abi"

inherit rpm
