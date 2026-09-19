SUMMARY = "Graph, mesh and hypergraph partitioning library"
DESCRIPTION = "Scotch is a software package for graph and mesh/hypergraph partitioning and \
sparse matrix ordering."
LICENSE = "CECILL-C"

PV = "7.0.15"

RPM_NAME = "libptscotch7_0-mvapich2-7.0.15-1.1.aarch64.rpm"
RPM_HASH = "30de984bbe331c0cee937355677104e0d7fb03619a75fc04489ed0d0adb81bfb7c0b82a468506aff95ec46b041d75c3b78a248f3181380d91c4b827ea9b5020d"

RPROVIDES:${PN} += "libesmumps.so.7.0 \
libptesmumps.so.7.0 \
libptscotch.so.7.0 \
libptscotch7-0-mvapich2 \
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
