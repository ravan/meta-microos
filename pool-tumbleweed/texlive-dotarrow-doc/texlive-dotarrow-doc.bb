SUMMARY = "Documentation for texlive-dotarrow"
DESCRIPTION = "This package includes the documentation for texlive-dotarrow"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.01asvn15878"

RPM_NAME = "texlive-dotarrow-doc-2026.226.0.0.01asvn15878-59.2.noarch.rpm"
RPM_HASH = "2a311e294c85e1bd02f638fcd0c9e2f84b1c864094fa1e310bb903da21a99be7ec317b0b23ae64354103def13c8d458fef5ef27cf14be061f47b55b6b8341612"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dotarrow-doc"

RDEPENDS:${PN} += ""

inherit rpm
