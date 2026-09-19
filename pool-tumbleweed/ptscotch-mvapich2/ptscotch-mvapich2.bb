SUMMARY = "Graph, mesh and hypergraph partitioning library"
DESCRIPTION = "Scotch is a software package for graph and mesh/hypergraph partitioning and \
sparse matrix ordering."
LICENSE = "CECILL-C"

PV = "7.0.15"

RPM_NAME = "ptscotch-mvapich2-7.0.15-1.1.aarch64.rpm"
RPM_HASH = "3ea1b91f372fa17fe47e052e506cbc93f1afec7f0a7315c4537847755c00b4998f7b686e8b3f03c4246cd5c1b5c4eb80180169440e3cb2ebe4ba3fc40505a202"

RPROVIDES:${PN} += "ptscotch-mvapich2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libmpi.so.12 \
libptscotch.so.7.0 \
libptscotcherr.so.7.0 \
libptscotcherrexit.so.7.0 \
libptscotchparmetisv3.so.7.0 \
libscotch.so.7.0 \
libscotcherrexit.so.7.0"

inherit rpm
