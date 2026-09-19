SUMMARY = "Documentation for texlive-emptypage"
DESCRIPTION = "This package includes the documentation for texlive-emptypage"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn78101"

RPM_NAME = "texlive-emptypage-doc-2026.226.1.2svn78101-61.4.noarch.rpm"
RPM_HASH = "13f77a6e2299de28a8c245d27b22bd25ee20d292c20a30ac7d4b6034ec8b00ab3eba261d8a47d040aae7013df7cd29c6874106b313366a434787707e6c2f9e5e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-emptypage-doc"

RDEPENDS:${PN} += ""

inherit rpm
