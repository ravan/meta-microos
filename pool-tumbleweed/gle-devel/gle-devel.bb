SUMMARY = "Development files for the GLE tubing and extrusion library"
DESCRIPTION = "The GLE Tubing and Extrusion Library is a graphics application \
programming interface (API). The library consists of a number of C \
language subroutines for drawing tubing and extrusions. The library is \
distributed in source code form in a package that includes \
documentation, a VRML proposal, make files, and full source code and \
header files. It uses the OpenGL (TM) programming API to perform the \
actual drawing of the tubing and extrusions."
LICENSE = "GPL-2.0-or-later"

PV = "3.1.2"

RPM_NAME = "gle-devel-3.1.2-1.9.aarch64.rpm"
RPM_HASH = "63976fd2e61d11b44ad2a62c11022a58bdc17102267d7025e54a4b2a8a8d3e093441edccda40bde6e23ca7881b57d4d72848c680df0df81451963e39c500b361"

RPROVIDES:${PN} += "gle-devel \
libgle-devel"

RDEPENDS:${PN} += "libgle3"

inherit rpm
