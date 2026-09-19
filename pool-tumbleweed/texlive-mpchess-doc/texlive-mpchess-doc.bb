SUMMARY = "Documentation for texlive-mpchess"
DESCRIPTION = "This package includes the documentation for texlive-mpchess"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.9svn78101"

RPM_NAME = "texlive-mpchess-doc-2026.226.0.0.9svn78101-61.2.noarch.rpm"
RPM_HASH = "775a5cc5ad0063016c28fbe1464ec0e6ab28fb40ca90336bc9041d029e6ca0e2bb05e51073366c2d3f270239f9db43093ac4651482e18e652da52db770ee877a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-mpchess-doc-fr \
texlive-mpchess-doc"

RDEPENDS:${PN} += ""

inherit rpm
