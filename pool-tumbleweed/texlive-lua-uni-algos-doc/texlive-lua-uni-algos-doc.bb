SUMMARY = "Documentation for texlive-lua-uni-algos"
DESCRIPTION = "This package includes the documentation for texlive-lua-uni-algos"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.5svn76195"

RPM_NAME = "texlive-lua-uni-algos-doc-2026.226.0.0.5svn76195-59.2.noarch.rpm"
RPM_HASH = "7fc6a4dc42f6b9dd5b2afc7967fc1d1dc0245dcf57c395f0c28fa8c23261f0e58bc857eb99bc10c369416ef66ec8cfe58b2ab4d1dda6639510d3828953d197e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lua-uni-algos-doc"

RDEPENDS:${PN} += ""

inherit rpm
