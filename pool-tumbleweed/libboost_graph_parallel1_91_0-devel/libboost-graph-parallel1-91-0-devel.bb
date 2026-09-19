SUMMARY = "Development headers for Boost.Graph parallel library"
DESCRIPTION = "Development headers for Boost.Graph parallel boost library."
LICENSE = "BSL-1.0"

PV = "1.91.0"

RPM_NAME = "libboost_graph_parallel1_91_0-devel-1.91.0-4.1.aarch64.rpm"
RPM_HASH = "f129a759f3cfdbb64c0ff937a8a7b23b392ee4e4226741f65f27042ad72608c2c2f4f3ad629633dc141ddedd7d8f3d0c98c5bcc95cefcc7afebd7b7ab4f71db3"

RPROVIDES:${PN} += "libboost-graph-parallel-devel-impl \
libboost-graph-parallel1-91-0-devel"

RDEPENDS:${PN} += "libboost-graph-parallel1-91-0 \
libboost-headers1-91-0-devel \
libboost-mpi1-91-0-devel"

inherit rpm
