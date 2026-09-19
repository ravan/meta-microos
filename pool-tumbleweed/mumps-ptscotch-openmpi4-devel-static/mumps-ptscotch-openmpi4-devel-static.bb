SUMMARY = "Files needed for developing mumps based applications"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
Static libraries for mumps-ptscotch-openmpi4."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps-ptscotch-openmpi4-devel-static-5.3.5-7.8.aarch64.rpm"
RPM_HASH = "052845cbfb40c62f70a6382cb1f6fd602a5e73408b45579c856c04b23d18b3f0446673bac91015cc512ecc49fd9c366d2c80be4677072cadd41df91a1d7d2e19"

RPROVIDES:${PN} += "mumps-ptscotch-openmpi4-devel-static"

RDEPENDS:${PN} += "mumps-ptscotch-openmpi4-devel"

inherit rpm
