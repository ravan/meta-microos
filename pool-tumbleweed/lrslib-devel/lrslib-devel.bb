SUMMARY = "Development files for Reverse Search Vertex Enumeration"
DESCRIPTION = "lrslib is a library for the reverse search algorithm for vertex \
enumeration/convex hull problems and comes with a choice of three \
arithmetic packages. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of lrslib."
LICENSE = "GPL-2.0-or-later"

PV = "7.3a"

RPM_NAME = "lrslib-devel-7.3a-1.4.aarch64.rpm"
RPM_HASH = "63575a43580ebf17f09cc03b12eea69fccd7396ab0009313cd41955c5acee755640ae0e6bb62845b8b2e3664e0a60c11e0f3c2802ac87412062fa5d0a20719e3"

RPROVIDES:${PN} += "lrslib-devel"

RDEPENDS:${PN} += "liblrs1"

inherit rpm
