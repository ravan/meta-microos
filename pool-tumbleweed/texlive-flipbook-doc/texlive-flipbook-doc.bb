SUMMARY = "Documentation for texlive-flipbook"
DESCRIPTION = "This package includes the documentation for texlive-flipbook"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn75878"

RPM_NAME = "texlive-flipbook-doc-2026.226.0.0.2svn75878-59.2.noarch.rpm"
RPM_HASH = "8e2a50844f4b88e19e15b5c6c9c5086120466cf864ed026361d8def55b21c81610c4b30e21d3894b956ae08b0b22b4ff1f16b872bc06d9ba28f180ea2eca93d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-flipbook-doc"

RDEPENDS:${PN} += ""

inherit rpm
