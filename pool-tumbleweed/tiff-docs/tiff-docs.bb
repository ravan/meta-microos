SUMMARY = "Development Tools for Programs which will use the libtiff Library"
DESCRIPTION = "This package contains the header files and static libraries for \
developing programs which will manipulate TIFF format image files using \
the libtiff library. \
 \
This package holds the man pages for the command lint tools."
LICENSE = "HPND"

PV = "4.7.2"

RPM_NAME = "tiff-docs-4.7.2-1.1.noarch.rpm"
RPM_HASH = "afd130c0c67d8a96f23b39fbd6b73832f9ab589889599145ef2cd03058b6453619340ea104a77b2d5e49d8c5a04a6110a032683410fe80f215593eb80bb424dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tiff-docs"

RDEPENDS:${PN} += "tiff"

inherit rpm
