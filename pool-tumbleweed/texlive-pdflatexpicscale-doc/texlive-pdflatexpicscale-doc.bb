SUMMARY = "Documentation for texlive-pdflatexpicscale"
DESCRIPTION = "This package includes the documentation for texlive-pdflatexpicscale"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.50svn72650"

RPM_NAME = "texlive-pdflatexpicscale-doc-2026.226.0.0.50svn72650-58.2.noarch.rpm"
RPM_HASH = "41b7274ff2c1a961034c8a1ef36ec5b0a86e9bc0e18192379d4e8cbac14541a0abb7c2812ef6954e5888fc14134df877ead06cb5e81f2833767dc8b8834115c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pdflatexpicscale-doc"

RDEPENDS:${PN} += ""

inherit rpm
