SUMMARY = "Pure-Python gRPC implementation for asyncio"
DESCRIPTION = "Pure-Python gRPC implementation for asyncio"
LICENSE = "BSD-3-Clause"

PV = "0.4.9"

RPM_NAME = "python313-grpclib-0.4.9-1.4.noarch.rpm"
RPM_HASH = "e5db2b56f0568dc144b87170460087b851c28bccf77534ebeeb5564616e62c7dbc760417c8c0c8f60feef638158ba6f5cf35c64184f77a57b233cb52587cb2fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-grpclib \
python3.13dist-grpclib \
python313-grpclib \
python3dist-grpclib"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-h2 \
python313-multidict \
update-alternatives"

inherit rpm
