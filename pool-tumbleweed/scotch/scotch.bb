SUMMARY = "Graph, mesh and hypergraph partitioning library"
DESCRIPTION = "Scotch is a software package for graph and mesh/hypergraph partitioning and \
sparse matrix ordering."
LICENSE = "CECILL-C"

PV = "7.0.15"

RPM_NAME = "scotch-7.0.15-1.1.aarch64.rpm"
RPM_HASH = "f7111bb5a3bee5befe206a289f754e4fd4a1077d10dd3ca55569569da317bfcfd8ea0670312ea99ae314783c3c0ba6c85ce55d022489babf40d8c882c31e3019"

RPROVIDES:${PN} += "scotch"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libscotch.so.7.0 \
libscotcherrexit.so.7.0"

inherit rpm
