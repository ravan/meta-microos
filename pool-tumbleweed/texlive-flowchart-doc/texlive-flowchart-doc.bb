SUMMARY = "Documentation for texlive-flowchart"
DESCRIPTION = "This package includes the documentation for texlive-flowchart"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.3svn36572"

RPM_NAME = "texlive-flowchart-doc-2026.226.3.3svn36572-60.2.noarch.rpm"
RPM_HASH = "ff1b5a7697f1fab4f06b70b8b406097cd51c7c642fe8047038c24ffaa144d2b178e6354a2ffaa54c13a29a663a4081a6ab6a7c66f6e9946814cedad9f0abc478"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-flowchart-doc"

RDEPENDS:${PN} += ""

inherit rpm
