SUMMARY = "A document class for German legal texts"
DESCRIPTION = "Implements the standard layout for German term papers in law \
(one-and-half linespacing, 7 cm margins, etc.). Includes \
alphanum that permits alphanumeric section numbering (e.g., A. \
Introduction; III. International Law)."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.4.3svn15878"

RPM_NAME = "texlive-jura-2026.226.4.3svn15878-63.2.noarch.rpm"
RPM_HASH = "8b38128c22e77a9a5cf6937e3b9c5cf041ce4cc3ae394f895978e468723275587a233b940f828c6e4b465faeb9e374fecee34755c5e336f5c3f8ec8941bcd199"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-alphanum.sty \
tex-jura.cls \
texlive-jura"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-report.cls \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
