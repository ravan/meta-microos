SUMMARY = "Documentation for texlive-currfile"
DESCRIPTION = "This package includes the documentation for texlive-currfile"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn77682"

RPM_NAME = "texlive-currfile-doc-2026.226.1.0svn77682-61.2.noarch.rpm"
RPM_HASH = "a2b458fe0887a9d831e9a3d4de9e95a9fef2d578234437aa06acc31dc042f58bc427b04aafcdbaab47833392fdfc74827cdf013a0535a4e6e9621400f4aa67aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-currfile-doc"

RDEPENDS:${PN} += ""

inherit rpm
