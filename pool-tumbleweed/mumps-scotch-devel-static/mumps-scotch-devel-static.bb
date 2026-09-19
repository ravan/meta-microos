SUMMARY = "Files needed for developing mumps based applications"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
Static libraries for mumps-scotch."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps-scotch-devel-static-5.3.5-7.7.aarch64.rpm"
RPM_HASH = "622e805a0bbd43969a5c496f0bc3e3e4bcda83d1dfc6f9cd843d3dbbb005917ce858d47d8739b1d11e32abbfc1bb67d57a559b292e39cfa0b8d401b71e843ed4"

RPROVIDES:${PN} += "mumps-scotch-devel-static"

RDEPENDS:${PN} += "mumps-scotch-devel"

inherit rpm
