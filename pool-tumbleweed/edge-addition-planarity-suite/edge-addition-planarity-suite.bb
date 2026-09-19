SUMMARY = "Edge Addition Planarity Suite"
DESCRIPTION = "EAPS provides implementations of the edge addition planar graph \
embedding algorithm and related algorithms, including a planar graph \
drawing method, an isolator for a minimal subgraph obstructing \
planarity in non-planar graphs, outerplanar graph embedder and \
obstruction isolator algorithms, and tester/isolator algorithms for \
subgraphs homeomorphic to K_{2,3}, K_4, and K_{3,3}."
LICENSE = "GPL-3.0-or-later"

PV = "5.1.0.0"

RPM_NAME = "edge-addition-planarity-suite-5.1.0.0-1.1.aarch64.rpm"
RPM_HASH = "8ddf657b3e1be20d1eb392fe8aacfe7248674e73a387bce859a7fe5eeee1254b27dd7bd68e2942691180fe34839547f4f8ef9a17b6bb455db4bb50dedfaa906b"

RPROVIDES:${PN} += "edge-addition-planarity-suite"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libplanarity.so.4"

inherit rpm
