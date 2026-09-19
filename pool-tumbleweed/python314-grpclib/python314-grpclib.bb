SUMMARY = "Pure-Python gRPC implementation for asyncio"
DESCRIPTION = "Pure-Python gRPC implementation for asyncio"
LICENSE = "BSD-3-Clause"

PV = "0.4.9"

RPM_NAME = "python314-grpclib-0.4.9-1.4.noarch.rpm"
RPM_HASH = "5a0717d5c3473c2102a913d30dcb710f47aaf8bc054ffae4337c8fde5277c6a3aa553455e8f8acf3820b49a3bc704ae8d9e32ff85eba3ab55e31553c1e45fe7b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-grpclib \
python314-grpclib \
python3dist-grpclib"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-h2 \
python314-multidict \
update-alternatives"

inherit rpm
