SUMMARY = "The GLE Tubing and Extrusion Library"
DESCRIPTION = "The GLE Tubing and Extrusion Library is a graphics application \
programming interface (API). The library consists of a number of C \
language subroutines for drawing tubing and extrusions. The library is \
distributed in source code form in a package that includes \
documentation, a VRML proposal, make files, and full source code and \
header files. It uses the OpenGL (TM) programming API to perform the \
actual drawing of the tubing and extrusions."
LICENSE = "GPL-2.0-or-later"

PV = "3.1.2"

RPM_NAME = "libgle3-3.1.2-1.9.aarch64.rpm"
RPM_HASH = "6987da9b20e5e6d5c17bc4b4abab1665de8ce5b2e03275c2621d2c6c2580bb72d166d0130a34aacf2b77edb35515ed50f90cfd6671ad109e44afc1c35114f033"

RPROVIDES:${PN} += "libgle.so.3 \
libgle3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libGLU.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
