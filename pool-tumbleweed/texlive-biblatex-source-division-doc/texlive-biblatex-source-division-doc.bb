SUMMARY = "Documentation for texlive-biblatex-source-division"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-source-division"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.4.2svn76790"

RPM_NAME = "texlive-biblatex-source-division-doc-2026.226.2.4.2svn76790-61.2.noarch.rpm"
RPM_HASH = "f984f36622c7b5eef982878ae4c34ff9377aa7df8efc11aace067e52062cec17ebcbf747c6927394eb7f42495b14fbaaa6266d558afcd7d65ef3e007e3989a97"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-source-division-doc"

RDEPENDS:${PN} += ""

inherit rpm
