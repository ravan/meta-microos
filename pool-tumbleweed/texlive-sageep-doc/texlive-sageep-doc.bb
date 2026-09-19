SUMMARY = "Documentation for texlive-sageep"
DESCRIPTION = "This package includes the documentation for texlive-sageep"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn15878"

RPM_NAME = "texlive-sageep-doc-2026.226.1.0svn15878-60.2.noarch.rpm"
RPM_HASH = "b3e2eafe09cd4839f121115fbd287acecc63443b8cd516e0ab9b717c40a5432fb7f489cd9ac29eb854ce7b117ea1bfde4594586a9f9f5ccb52499464e5a1c66c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sageep-doc"

RDEPENDS:${PN} += ""

inherit rpm
