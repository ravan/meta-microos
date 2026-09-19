SUMMARY = "Documentation for texlive-parrun"
DESCRIPTION = "This package includes the documentation for texlive-parrun"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-parrun-doc-2026.226.svn15878-58.2.noarch.rpm"
RPM_HASH = "06007f24a957bc03b3d42ae417a7b51daca56ecaa1c4ad4d8608e2f247f1d252d05242387e38bacf2d218947904ceab2f9fd61ebe2ce62954b808b57a65d7273"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-parrun-doc"

RDEPENDS:${PN} += ""

inherit rpm
