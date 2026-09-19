SUMMARY = "Documentation for texlive-freemath"
DESCRIPTION = "This package includes the documentation for texlive-freemath"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn76930"

RPM_NAME = "texlive-freemath-doc-2026.226.1.1svn76930-60.2.noarch.rpm"
RPM_HASH = "869a8fc5458ad094f98c053b410dcd47f07abe73fcd13f936a6d26aa69614dcbe29635be58ecda9b2156caf0c1a9977d9ae8215a59991b4d204ec3b687efe241"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-freemath-doc"

RDEPENDS:${PN} += ""

inherit rpm
