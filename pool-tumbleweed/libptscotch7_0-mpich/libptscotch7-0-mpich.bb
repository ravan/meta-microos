SUMMARY = "Graph, mesh and hypergraph partitioning library"
DESCRIPTION = "Scotch is a software package for graph and mesh/hypergraph partitioning and \
sparse matrix ordering."
LICENSE = "CECILL-C"

PV = "7.0.15"

RPM_NAME = "libptscotch7_0-mpich-7.0.15-1.1.aarch64.rpm"
RPM_HASH = "20d5f2522d839abd82a97e03ba1079773dc22c4bb321070539ece546753839e873b6392e1e49c9f0f5c73e339701e24fabaedaf8961cc34bfa47183245b09464"

RPROVIDES:${PN} += "libesmumps.so.7.0 \
libptesmumps.so.7.0 \
libptscotch.so.7.0 \
libptscotch7-0-mpich \
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
libmpi.so.12 \
libscotch7-0 \
libz.so.1"

inherit rpm
