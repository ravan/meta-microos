SUMMARY = "Comprehensive citation style for German legal texts"
DESCRIPTION = "This package aims to provide citation styles (for footnotes and \
bibliographies) for German legal texts. It is currently focused \
on citations in books (style german-legal-book), but may be \
extended to journal articles in the future. Dieses Paket \
enthalt BibLaTeX-Zitierstile fur die Rechtswissenschaften in \
Deutschland. Aktuell enthalt es einen auf Monographien in den \
deutschen Rechtswissenschaften ausgerichteten Zitierstil namens \
german-legal-book."
LICENSE = "LPPL-1.0"

PV = "2026.226.003svn66461"

RPM_NAME = "texlive-biblatex-german-legal-2026.226.003svn66461-61.2.noarch.rpm"
RPM_HASH = "26e41669e123345a7301d01a65c600e5efb163d3c05c2a28dede708797da9388fcc1983c2f24103e13a767e399f3a081f2e3be60ea5f0190bd22dd0863a21d6e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-german-legal-book.bbx \
tex-german-legal-book.cbx \
texlive-biblatex-german-legal"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ext-authortitle.bbx \
tex-ext-authortitle.cbx \
tex-xpatch.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
