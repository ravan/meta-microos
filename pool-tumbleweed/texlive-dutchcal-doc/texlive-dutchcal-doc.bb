SUMMARY = "Documentation for texlive-dutchcal"
DESCRIPTION = "This package includes the documentation for texlive-dutchcal"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn77682"

RPM_NAME = "texlive-dutchcal-doc-2026.226.1.0svn77682-59.2.noarch.rpm"
RPM_HASH = "76a5bc8108f42a1f996aa69ff29b60ace375c91c66c85ac4a7d740610115a4cfc62cafa3b6e3bb75b1c9e07de6e87d46a548361b1858a0a4ef138d307b78c243"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dutchcal-doc"

RDEPENDS:${PN} += ""

inherit rpm
