SUMMARY = "Documentation for texlive-beamer-fuberlin"
DESCRIPTION = "This package includes the documentation for texlive-beamer-fuberlin"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.02bsvn63161"

RPM_NAME = "texlive-beamer-fuberlin-doc-2026.226.0.0.02bsvn63161-61.2.noarch.rpm"
RPM_HASH = "2206a996583d993e5a6f1b156e1894a46a4b512a32a7589e145e76fb4a1ba1cc3cadffb8602c20ad9c1e86b73e03cf1d5b47a87bd721a86e7b89183c127dae97"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-beamer-fuberlin-doc"

RDEPENDS:${PN} += ""

inherit rpm
