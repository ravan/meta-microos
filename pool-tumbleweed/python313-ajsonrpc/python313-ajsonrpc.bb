SUMMARY = "Async JSON-RPC 20 protocol + server powered by asyncio"
DESCRIPTION = "Async JSON-RPC 2.0 protocol + server powered by asyncio."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python313-ajsonrpc-1.2.0-4.5.noarch.rpm"
RPM_HASH = "5ec58bdb125b1e4335729ec8b8b25401630684845c05b93bb601411c6cc06d1ec50d9dbb2ed6f37658920c16e9077bbf6eb3c0813beecdf5c6ff4ea51001c416"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ajsonrpc \
python3.13dist-ajsonrpc \
python313-ajsonrpc \
python3dist-ajsonrpc"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
