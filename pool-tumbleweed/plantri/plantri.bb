SUMMARY = "Programs for generating certain types of planar graphs"
DESCRIPTION = "plantri is a program that generates certain types of graphs that are \
embedded on the sphere. \
 \
Exactly one member of each isomorphism class is output, using an \
amount of memory almost independent of the number of graphs produced. \
Isomorphisms are defined with respect to the imbeddings, so in some \
cases outputs may be isomorphic as abstract graphs."
LICENSE = "Apache-2.0"

PV = "5.8"

RPM_NAME = "plantri-5.8-1.3.aarch64.rpm"
RPM_HASH = "f2f22c6b968401407a0e334b18c0b0d7d942c4116085610345cb69c4bae521db7f86aa744f72ad99bf0dfbd3dbb2a48caf86f7214367fa68953d8b681663363d"

RPROVIDES:${PN} += "plantri"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
