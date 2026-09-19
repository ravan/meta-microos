SUMMARY = "Files needed for developing mumps based applications"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
Headers and development files for mumps-mvapich2."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps-mvapich2-devel-5.3.5-7.7.aarch64.rpm"
RPM_HASH = "b478ee6dc3f2bbb1cb9b9c7ebc1f5c23a318d9528d3e86a53d5c476388d2fa72f308737f94f62af0c9ade73888e2110daa391ddcf160d5a99031a9c527bc213e"

RPROVIDES:${PN} += "mumps-mvapich2-devel"

RDEPENDS:${PN} += "libmumps5-3-5-mvapich2 \
mumps-devel \
mvapich2-devel \
scalapack-mvapich2-devel"

inherit rpm
