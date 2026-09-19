SUMMARY = "Files needed for developing mumps based applications"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
Static libraries for mumps-openmpi5."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps-openmpi5-devel-static-5.3.5-7.7.aarch64.rpm"
RPM_HASH = "7b9cf40ca6c7853253fdff7962a844eec71d73dd41f924df219b03df347c0eb3f6d18a723357ea42f1002b722e6bb67528b766c06e0a088eb8621b0c4fd5855c"

RPROVIDES:${PN} += "mumps-openmpi5-devel-static"

RDEPENDS:${PN} += "mumps-openmpi5-devel"

inherit rpm
