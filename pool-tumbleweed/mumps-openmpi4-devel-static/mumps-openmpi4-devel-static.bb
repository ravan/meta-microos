SUMMARY = "Files needed for developing mumps based applications"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
Static libraries for mumps-openmpi4."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps-openmpi4-devel-static-5.3.5-7.7.aarch64.rpm"
RPM_HASH = "d8bd953b37c72dc3c8bc41d2b9b5f2fdce57c71e456cf55f81b0d3da2943a9ff98befdc9c5d54bab461f940dbb0befda55707fc8097fac812046ec622e8c11b2"

RPROVIDES:${PN} += "mumps-openmpi4-devel-static"

RDEPENDS:${PN} += "mumps-openmpi4-devel"

inherit rpm
