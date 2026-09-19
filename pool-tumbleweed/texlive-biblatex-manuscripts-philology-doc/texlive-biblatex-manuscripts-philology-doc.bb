SUMMARY = "Documentation for texlive-biblatex-manuscripts-philology"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-manuscripts-philology"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.1.4svn66977"

RPM_NAME = "texlive-biblatex-manuscripts-philology-doc-2026.226.2.1.4svn66977-61.2.noarch.rpm"
RPM_HASH = "5c8ff92abfdc35c4401b3f2fc3d209bc09c3a4b65247f24f54e08b4f17e0bc4729d7cb8e9b83e48a7da91ab29ab03653720309c52939e2d685498fdfcdc14a1e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-manuscripts-philology-doc"

RDEPENDS:${PN} += ""

inherit rpm
