SUMMARY = "Async JSON-RPC 20 protocol + server powered by asyncio"
DESCRIPTION = "Async JSON-RPC 2.0 protocol + server powered by asyncio."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python314-ajsonrpc-1.2.0-4.5.noarch.rpm"
RPM_HASH = "1f33b62de5e2f4ff5fb472d8ea242764152a23c84f03353c63fc49fb8a368a470c61e9d50937a8b234b6acab859a6a5e7817cbb94a3aedc42df84aacd0a75b12"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-ajsonrpc \
python314-ajsonrpc \
python3dist-ajsonrpc"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
