SUMMARY = "Graph, mesh and hypergraph partitioning library"
DESCRIPTION = "Scotch is a software package for graph and mesh/hypergraph partitioning and \
sparse matrix ordering."
LICENSE = "CECILL-C"

PV = "7.0.15"

RPM_NAME = "libscotch7_0-7.0.15-1.1.aarch64.rpm"
RPM_HASH = "1ea51f083f6fbba6d181ab6ca1b85a77d4b58875fd5de386dd913abd86d2e37abfa3466575ca5af67cbe7d3878e4bd0024ca28159a5bf89d94da7ab9301db859"

RPROVIDES:${PN} += "libesmumps.so.7.0 \
libscotch.so.7.0 \
libscotch7-0 \
libscotcherr.so.7.0 \
libscotcherrexit.so.7.0 \
libscotchmetisv3.so.7.0 \
libscotchmetisv5.so.7.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
liblzma.so.5 \
libm.so.6 \
libz.so.1"

inherit rpm
