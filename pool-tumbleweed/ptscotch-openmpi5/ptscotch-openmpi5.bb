SUMMARY = "Graph, mesh and hypergraph partitioning library"
DESCRIPTION = "Scotch is a software package for graph and mesh/hypergraph partitioning and \
sparse matrix ordering."
LICENSE = "CECILL-C"

PV = "7.0.15"

RPM_NAME = "ptscotch-openmpi5-7.0.15-1.1.aarch64.rpm"
RPM_HASH = "a65db88669df8486eb56a6253fd5d95b83d5c1363d6b497cac350dad9a19940df1559b6f09a371341d3e9be4ca12357ffcd7245e8bf36d96c5ffac88c2eb2665"

RPROVIDES:${PN} += "ptscotch-openmpi5"

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
