SUMMARY = "Documentation for texlive-rotfloat"
DESCRIPTION = "This package includes the documentation for texlive-rotfloat"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn77682"

RPM_NAME = "texlive-rotfloat-doc-2026.226.1.2svn77682-60.2.noarch.rpm"
RPM_HASH = "76620b629d92abc98fcd5529257e133027fddfe242be5968f3b0f1d16e5eeef25148620a8fcbac4bdc27d7bd10ec937c0769c26698e6fab011e366b6739c0403"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-rotfloat-doc"

RDEPENDS:${PN} += ""

inherit rpm
