SUMMARY = "Documentation for texlive-otibet"
DESCRIPTION = "This package includes the documentation for texlive-otibet"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn45777"

RPM_NAME = "texlive-otibet-doc-2026.226.svn45777-61.2.noarch.rpm"
RPM_HASH = "e7de5ea456c5e2b1b1f6b43efab507bc4a17f8682f9b4c3d3d13100895b29cd3e85416525cabb0a9eb33293dd3246a861ff8f9df182c840ddc7973939dd72caa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-otibet-doc"

RDEPENDS:${PN} += ""

inherit rpm
