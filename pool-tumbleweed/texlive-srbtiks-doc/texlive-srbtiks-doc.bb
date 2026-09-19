SUMMARY = "Documentation for texlive-srbtiks"
DESCRIPTION = "This package includes the documentation for texlive-srbtiks"
LICENSE = "OFL-1.1"

PV = "2026.226.1.0svn63308"

RPM_NAME = "texlive-srbtiks-doc-2026.226.1.0svn63308-64.2.noarch.rpm"
RPM_HASH = "5766658affe919b48894afb0940d38da1ed9b229296b44a17e514c014ce781b213873e61c61203f44afcbb5698722dd8c871a869f4bc7677fac36b0f4540fe28"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-srbtiks-doc"

RDEPENDS:${PN} += ""

inherit rpm
