SUMMARY = "Documentation for texlive-chessboard"
DESCRIPTION = "This package includes the documentation for texlive-chessboard"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0svn78101"

RPM_NAME = "texlive-chessboard-doc-2026.226.2.0svn78101-60.2.noarch.rpm"
RPM_HASH = "bb65099a1962490a2878d67039f31a1e89bc5072826deeb05b8c30f3b30bcf2124905e441da8557b84e8153ec931aca548bd9506e74b8ddbf03bb86eb2d4bf6b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-chessboard-doc"

RDEPENDS:${PN} += ""

inherit rpm
