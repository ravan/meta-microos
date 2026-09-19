SUMMARY = "Documentation for texlive-biblatex-phys"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-phys"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1esvn74898"

RPM_NAME = "texlive-biblatex-phys-doc-2026.226.1.1esvn74898-61.2.noarch.rpm"
RPM_HASH = "a3df72f6e4507d9554007010e927113458b0b662b6e3d8e617b1e216950c67d882ae5d1906966617357016e4b9e5279889077556badac2f4502832a6a15ccc23"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-phys-doc"

RDEPENDS:${PN} += ""

inherit rpm
