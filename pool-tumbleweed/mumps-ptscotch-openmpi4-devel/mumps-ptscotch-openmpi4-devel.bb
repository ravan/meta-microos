SUMMARY = "Files needed for developing mumps based applications"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
Headers and development files for mumps-ptscotch-openmpi4."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps-ptscotch-openmpi4-devel-5.3.5-7.8.aarch64.rpm"
RPM_HASH = "a8efa527f4dbad19e42b9d96d2eb62c9fee1b11903f4fe5135fc1751b848f620d12b0706a2fdf03eda907335428e1fb866c334c2f72cdfc8928e93fce8870a24"

RPROVIDES:${PN} += "mumps-ptscotch-openmpi4-devel"

RDEPENDS:${PN} += "libmumps-ptscotch5-3-5-openmpi4 \
mumps-devel \
mumps-scotch-devel \
openmpi4-devel \
ptscotch-openmpi4-devel \
scalapack-openmpi4-devel"

inherit rpm
