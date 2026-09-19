SUMMARY = "Documentation for texlive-epigraph"
DESCRIPTION = "This package includes the documentation for texlive-epigraph"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.5esvn77682"

RPM_NAME = "texlive-epigraph-doc-2026.226.1.5esvn77682-61.4.noarch.rpm"
RPM_HASH = "ec74daf11c5a1d4a209d27d5e4fc13e479a954a1357a0e09a476c6cc7ee1837f7153da01601909637f1cf2619a237bd02ac6fe5f1a55fb22bb20f73ef3dcaf6f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-epigraph-doc"

RDEPENDS:${PN} += ""

inherit rpm
