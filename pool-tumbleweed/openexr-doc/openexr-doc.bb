SUMMARY = "Documentation for the 16-bit FP EXR picture handling library"
DESCRIPTION = "OpenEXR is a high dynamic-range (HDR) image file format developed by \
Industrial Light & Magic for use in computer imaging applications. \
 \
This package contains documentation."
LICENSE = "BSD-3-Clause"

PV = "3.4.14"

RPM_NAME = "openexr-doc-3.4.14-1.1.noarch.rpm"
RPM_HASH = "3bbb20236b807d344cb9ec26c666f0b5d4b5125523d4315d7c8b6dd277368cb6789036146a242e4144ec1941d595caaeeec69bfc71895fa24408f263d74ea210"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "OpenEXR-doc \
openexr-doc"

RDEPENDS:${PN} += ""

inherit rpm
