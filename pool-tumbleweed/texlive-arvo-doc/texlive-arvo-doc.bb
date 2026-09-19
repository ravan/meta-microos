SUMMARY = "Documentation for texlive-arvo"
DESCRIPTION = "This package includes the documentation for texlive-arvo"
LICENSE = "OFL-1.1"

PV = "2026.226.svn57213"

RPM_NAME = "texlive-arvo-doc-2026.226.svn57213-60.2.noarch.rpm"
RPM_HASH = "6d9825133153d26aa97f088ac4cb95ea06f2fb2b1db3198f78189654ecfbc927eccd8e1edcb9f4d6288ad89347d91814eb0fc1774f15969af589b04b963451c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-arvo-doc"

RDEPENDS:${PN} += ""

inherit rpm
