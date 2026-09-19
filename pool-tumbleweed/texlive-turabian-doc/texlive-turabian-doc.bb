SUMMARY = "Documentation for texlive-turabian"
DESCRIPTION = "This package includes the documentation for texlive-turabian"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1.0svn36298"

RPM_NAME = "texlive-turabian-doc-2026.226.0.0.1.0svn36298-59.2.noarch.rpm"
RPM_HASH = "3687d892610dc3474dc4f3ef627bb89baa49bc86e9581372c5f8784f0fcbc8fea4283ba6676e6c2ef5f2b222aa3abc490a3f9b7e98bf43a4887ef8f4169a2566"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-turabian-doc"

RDEPENDS:${PN} += ""

inherit rpm
