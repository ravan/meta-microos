SUMMARY = "Documentation for texlive-saveenv"
DESCRIPTION = "This package includes the documentation for texlive-saveenv"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.0.1svn76924"

RPM_NAME = "texlive-saveenv-doc-2026.226.0.0.0.1svn76924-60.2.noarch.rpm"
RPM_HASH = "e16e9430525d13240c0eae3c28fc346597d11ef9a5024263706b48afde1b902431ff0c0224f97f41fa4eae08c22008e2e3acc2bdd4c8660106a0cbe90b92b9cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-saveenv-doc"

RDEPENDS:${PN} += ""

inherit rpm
