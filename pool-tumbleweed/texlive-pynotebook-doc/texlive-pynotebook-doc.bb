SUMMARY = "Documentation for texlive-pynotebook"
DESCRIPTION = "This package includes the documentation for texlive-pynotebook"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1.4svn75593"

RPM_NAME = "texlive-pynotebook-doc-2026.226.0.0.1.4svn75593-60.4.noarch.rpm"
RPM_HASH = "3c644af3df0bc713f0878293eacbc789fee36cc46e012034881e49df811433f398b62c784310cb3e4dc955a151e7e6a684cbc40d1d1ad4c966431e288e0a7a69"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pynotebook-doc"

RDEPENDS:${PN} += ""

inherit rpm
