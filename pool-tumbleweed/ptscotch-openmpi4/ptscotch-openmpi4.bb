SUMMARY = "Graph, mesh and hypergraph partitioning library"
DESCRIPTION = "Scotch is a software package for graph and mesh/hypergraph partitioning and \
sparse matrix ordering."
LICENSE = "CECILL-C"

PV = "7.0.15"

RPM_NAME = "ptscotch-openmpi4-7.0.15-1.1.aarch64.rpm"
RPM_HASH = "8699a6e9e269567524a566816f97c786d3113eacbf9a188a8d14971ba5e3953d7aa4dff8636c04af492314b6ac869417ad5e646ed2a319fd3705995f43d8d716"

RPROVIDES:${PN} += "ptscotch-openmpi4"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libmpi.so.40 \
libptscotch.so.7.0 \
libptscotcherr.so.7.0 \
libptscotcherrexit.so.7.0 \
libptscotchparmetisv3.so.7.0 \
libscotch.so.7.0 \
libscotcherrexit.so.7.0"

inherit rpm
