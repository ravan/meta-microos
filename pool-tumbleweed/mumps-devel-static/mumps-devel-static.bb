SUMMARY = "Files needed for developing mumps based applications"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
Static libraries for mumps."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps-devel-static-5.3.5-7.6.aarch64.rpm"
RPM_HASH = "5daf4bbc0f480dca73eb43fb037b904550c792171a61a5d0d9693bc7a0e8ead4037e64fdb5cd408b93444fef1f87b976b867cb4b97ebd52daecf99d8844fe565"

RPROVIDES:${PN} += "mumps-devel-static"

RDEPENDS:${PN} += "mumps-devel"

inherit rpm
