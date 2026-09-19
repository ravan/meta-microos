SUMMARY = "Documentation for texlive-limap"
DESCRIPTION = "This package includes the documentation for texlive-limap"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.2svn44863"

RPM_NAME = "texlive-limap-doc-2026.226.2.2svn44863-61.2.noarch.rpm"
RPM_HASH = "4c9d5017c09cd9610b8c3a2babc68e1da618d361ece3f4dc55f8c8fdc1b368a7714a4b678c09715b6e950185a55bae9f62da5184cad091b641b3a0b03b70afd5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-limap-doc"

RDEPENDS:${PN} += ""

inherit rpm
