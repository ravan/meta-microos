SUMMARY = "Documentation for texlive-namedef"
DESCRIPTION = "This package includes the documentation for texlive-namedef"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn77682"

RPM_NAME = "texlive-namedef-doc-2026.226.1.0svn77682-61.2.noarch.rpm"
RPM_HASH = "accd173a399f55b469ffa1a53b0786ebaf3cc4786aacade5874665e24b77dcd13e8022fe5708d8ccebf153775674b986ac2b2e8a1c55dabd368a3465d2da58b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-namedef-doc"

RDEPENDS:${PN} += ""

inherit rpm
