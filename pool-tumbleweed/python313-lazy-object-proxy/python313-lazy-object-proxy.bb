SUMMARY = "Rebuild a new abstract syntax tree from Python's ast"
DESCRIPTION = "A fast and thorough lazy object proxy that rebuilds a new abstract syntax tree \
from Python's ast"
LICENSE = "BSD-2-Clause"

PV = "1.12.0"

RPM_NAME = "python313-lazy-object-proxy-1.12.0-2.1.aarch64.rpm"
RPM_HASH = "e524c691b433c1d5d317021230d9dbcf8cf606870485bf338385dde08513addb068e701a00b7b70fa21102df72fcbcf72128f5893d1d3c151724ec36cc5827ab"

RPROVIDES:${PN} += "python3-lazy-object-proxy \
python3.13dist-lazy-object-proxy \
python313-lazy-object-proxy \
python3dist-lazy-object-proxy"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
