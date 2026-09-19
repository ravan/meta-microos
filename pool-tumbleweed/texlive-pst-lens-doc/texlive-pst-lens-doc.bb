SUMMARY = "Documentation for texlive-pst-lens"
DESCRIPTION = "This package includes the documentation for texlive-pst-lens"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.02svn15878"

RPM_NAME = "texlive-pst-lens-doc-2026.226.1.02svn15878-59.2.noarch.rpm"
RPM_HASH = "4d95805e651ecaeaf91f61828f884b2c76ba10086ae72c1e43be29dc79a8f9676ccbba40d80e56aa403efd8a29961ed4fc418b4a1ae451fc2be917fc718f3ebf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-lens-doc"

RDEPENDS:${PN} += ""

inherit rpm
