SUMMARY = "Documentation for texlive-antomega"
DESCRIPTION = "This package includes the documentation for texlive-antomega"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.8svn21933"

RPM_NAME = "texlive-antomega-doc-2026.226.0.0.8svn21933-61.2.noarch.rpm"
RPM_HASH = "93aa82c08a037490679fe2257742a305b56f7baeae9dda091b2d863c8c0d5b1b6dc5894c457d70a811fa834844af0d0c4c9af665cab6a9c4cb11142ef4fdfbc1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-antomega-doc"

RDEPENDS:${PN} += ""

inherit rpm
