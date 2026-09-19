SUMMARY = "Documentation for texlive-limecv"
DESCRIPTION = "This package includes the documentation for texlive-limecv"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1.12svn75301"

RPM_NAME = "texlive-limecv-doc-2026.226.0.0.1.12svn75301-61.2.noarch.rpm"
RPM_HASH = "e18bb5e15759480f7847109105113b20489b84d612f44fa1785a25ead4f80db8d68f45a24a36fdb606fc9a03a39c04340191b6a350893df41e06224a124c80a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-limecv-doc"

RDEPENDS:${PN} += ""

inherit rpm
