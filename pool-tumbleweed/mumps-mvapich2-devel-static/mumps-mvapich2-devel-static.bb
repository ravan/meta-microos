SUMMARY = "Files needed for developing mumps based applications"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
Static libraries for mumps-mvapich2."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps-mvapich2-devel-static-5.3.5-7.7.aarch64.rpm"
RPM_HASH = "57fbe1bf8172a80ab64d783b4499ee07ebbcb30aec44c894b4dade670a3e94b00a17287b92ace445935ac0c6cc3ebf1fdda078bc85474f590f5b35b3b37fb3c3"

RPROVIDES:${PN} += "mumps-mvapich2-devel-static"

RDEPENDS:${PN} += "mumps-mvapich2-devel"

inherit rpm
