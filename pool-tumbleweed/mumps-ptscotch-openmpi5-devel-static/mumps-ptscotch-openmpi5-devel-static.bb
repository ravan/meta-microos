SUMMARY = "Files needed for developing mumps based applications"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
Static libraries for mumps-ptscotch-openmpi5."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps-ptscotch-openmpi5-devel-static-5.3.5-7.8.aarch64.rpm"
RPM_HASH = "3a085e38ffd0f32b072718c338cebc4cf186e738592e5e809bab684570a30cc9773aa49380b75acdab96b3bf3d1c354fcd8b00501ddac4296e11a6c06c78a0ab"

RPROVIDES:${PN} += "mumps-ptscotch-openmpi5-devel-static"

RDEPENDS:${PN} += "mumps-ptscotch-openmpi5-devel"

inherit rpm
