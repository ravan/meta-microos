SUMMARY = "Utility to create a shadow directory of symbolic links to another directory tree"
DESCRIPTION = "The lndir program makes a shadow copy of a directory tree, except that \
the shadow is not populated with real files but instead with symbolic \
links pointing at the real files in the original directory tree."
LICENSE = "MIT"

PV = "1.0.6"

RPM_NAME = "lndir-1.0.6-1.1.aarch64.rpm"
RPM_HASH = "94bc5a6b2f63cb898f0345db63b6d006b96a882b9f46101a469e917cc084fabf2d35bcaa7cbabba6b604c56ba515fb30710b8f7451b86c9903865b392a8179c0"

RPROVIDES:${PN} += "lndir"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
