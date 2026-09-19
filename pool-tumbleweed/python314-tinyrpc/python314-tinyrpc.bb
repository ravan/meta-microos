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

RPM_NAME = "python314-tinyrpc-1.1.7-2.5.noarch.rpm"
RPM_HASH = "dd9fb4e3973eb0afb03a77ad89e841aa6f1f966eb39438089560ccad945e93a3d86e9537f1b8232d5433a940cf0d7361b2f7df4579dfb0218a2c95577ec1b071"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-tinyrpc \
python314-tinyrpc \
python3dist-tinyrpc"

RDEPENDS:${PN} += "python-abi"

inherit rpm
