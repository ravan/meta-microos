SUMMARY = "Documentation for texlive-xpeekahead"
DESCRIPTION = "This package includes the documentation for texlive-xpeekahead"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3asvn77050"

RPM_NAME = "texlive-xpeekahead-doc-2026.226.1.3asvn77050-59.4.noarch.rpm"
RPM_HASH = "9686351e0d3f53b70030570b3c9993dd8caa42a1b3803be68c8a5f9c5987d9e8eb89cec05518bebce6b5cdfe569cbe6646e33982ff2c6ba4422b7cbd521942a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xpeekahead-doc"

RDEPENDS:${PN} += ""

inherit rpm
