SUMMARY = "Boost.Graph.Distributed runtime library"
DESCRIPTION = "This package contains the Boost.Graph parallel runtime library"
LICENSE = "BSL-1.0"

PV = "1.91.0"

RPM_NAME = "libboost_graph_parallel1_91_0-1.91.0-4.1.aarch64.rpm"
RPM_HASH = "6f4e8463672b996f770ae47c124874747bf97bf520778968537e3897911b07e3121f8a350ca7d7517412196d38cca6550294f514ee38b701541205d2460b1144"

RPROVIDES:${PN} += "libboost-graph-parallel.so.1.91.0 \
libboost-graph-parallel1-91-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
boost-license1-91-0 \
libboost-mpi.so.1.91.0 \
libboost-serialization.so.1.91.0 \
libc.so.6 \
libgcc-s.so.1 \
libmpi.so.40 \
libstdc++.so.6"

inherit rpm
