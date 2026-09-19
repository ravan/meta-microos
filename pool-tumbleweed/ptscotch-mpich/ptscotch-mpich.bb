SUMMARY = "Graph, mesh and hypergraph partitioning library"
DESCRIPTION = "Scotch is a software package for graph and mesh/hypergraph partitioning and \
sparse matrix ordering."
LICENSE = "CECILL-C"

PV = "7.0.15"

RPM_NAME = "ptscotch-mpich-7.0.15-1.1.aarch64.rpm"
RPM_HASH = "224075a54e92cb384bcf5fa6c44ecb75bbdf05c44febd14a075cff38381ad033c054023924b241e261536b6511689267ec08e859b4ac1247232b9bfbef753fa1"

RPROVIDES:${PN} += "ptscotch-mpich"

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
