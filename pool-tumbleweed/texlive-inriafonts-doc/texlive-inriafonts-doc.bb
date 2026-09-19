SUMMARY = "Documentation for texlive-inriafonts"
DESCRIPTION = "This package includes the documentation for texlive-inriafonts"
LICENSE = "OFL-1.1"

PV = "2026.226.1.0svn77682"

RPM_NAME = "texlive-inriafonts-doc-2026.226.1.0svn77682-60.2.noarch.rpm"
RPM_HASH = "29cddc16ced5de83b6c4696c4f7962c02da6e3184c34880787a2a04b0f78436e099cd2d6bd638deaa4db8231084524a9bc1d2a2291f3adec421325306c0b64f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-inriafonts-doc"

RDEPENDS:${PN} += ""

inherit rpm
