SUMMARY = "BibLaTeX style for the journal 'Historische Zeitschrift'"
DESCRIPTION = "The package provides citations according with the house style \
of the 'Historische Zeitschrift', a German historical journal. \
The scheme is a fullcite for the first citation and 'Author, \
Shorttitle (as note N, P)' for later citations (P being the \
page number). For further details, see the description of the \
house style at the journal's site. The package depends on \
BibLaTeX (version 3.3 or higher) as well as etoolbox (version \
1.5 or higher)."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn42635"

RPM_NAME = "texlive-historische-zeitschrift-2026.226.1.2svn42635-60.4.noarch.rpm"
RPM_HASH = "9eab4b1a7413a95fd3d41bf488d7ea61022e469712280e343cec722d0a6eaf548b18f84e060b4efec20035001bde2611dfef1f48afa8f55f3b49f9e8c6dcec08"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-historische-zeitschrift.bbx \
tex-historische-zeitschrift.cbx \
tex-historische-zeitschrift.lbx \
texlive-historische-zeitschrift"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
