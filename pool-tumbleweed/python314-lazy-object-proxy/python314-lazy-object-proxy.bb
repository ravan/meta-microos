SUMMARY = "Rebuild a new abstract syntax tree from Python's ast"
DESCRIPTION = "A fast and thorough lazy object proxy that rebuilds a new abstract syntax tree \
from Python's ast"
LICENSE = "BSD-2-Clause"

PV = "1.12.0"

RPM_NAME = "python314-lazy-object-proxy-1.12.0-2.1.aarch64.rpm"
RPM_HASH = "b6fbd03c4c31e04af47347ecc613ceb3124f19bcb816803dc05427564583c68e52509a341df4b971126a1e536d557547baa36a3ac94e143e060f3038ad8a00f1"

RPROVIDES:${PN} += "python3.14dist-lazy-object-proxy \
python314-lazy-object-proxy \
python3dist-lazy-object-proxy"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
