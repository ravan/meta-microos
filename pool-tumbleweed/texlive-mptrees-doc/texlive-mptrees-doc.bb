SUMMARY = "Documentation for texlive-mptrees"
DESCRIPTION = "This package includes the documentation for texlive-mptrees"
LICENSE = "LPPL-1.0"

PV = "2026.226.24.04svn70887"

RPM_NAME = "texlive-mptrees-doc-2026.226.24.04svn70887-61.2.noarch.rpm"
RPM_HASH = "0bea6c49334bdb9e812ade4569b31447e0bec092b0752e25811ae2cf2c117e5d8326e47459479f7e83fc39592c3434b918f9d373477a43f2a3cfbfb2d9078f9e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mptrees-doc"

RDEPENDS:${PN} += ""

inherit rpm
