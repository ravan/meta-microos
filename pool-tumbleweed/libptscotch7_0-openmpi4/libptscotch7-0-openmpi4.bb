SUMMARY = "Graph, mesh and hypergraph partitioning library"
DESCRIPTION = "Scotch is a software package for graph and mesh/hypergraph partitioning and \
sparse matrix ordering."
LICENSE = "CECILL-C"

PV = "7.0.15"

RPM_NAME = "libptscotch7_0-openmpi4-7.0.15-1.1.aarch64.rpm"
RPM_HASH = "352c7df776599dadfcaf6539006763686ed3f3b45df5772ddde17aa05d38a54ee59b7f795165ffd9179d6cdbc3da0bfaf8bd09d6925ef7648c26793f6a20b22b"

RPROVIDES:${PN} += "libesmumps.so.7.0 \
libptesmumps.so.7.0 \
libptscotch.so.7.0 \
libptscotch7-0-openmpi4 \
libptscotcherr.so.7.0 \
libptscotcherrexit.so.7.0 \
libptscotchparmetisv3.so.7.0 \
libscotch.so.7.0 \
libscotcherr.so.7.0 \
libscotcherrexit.so.7.0 \
libscotchmetisv3.so.7.0 \
libscotchmetisv5.so.7.0"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
liblzma.so.5 \
libm.so.6 \
libmpi.so.40 \
libscotch7-0 \
libz.so.1"

inherit rpm
