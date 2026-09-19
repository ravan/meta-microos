SUMMARY = "Global Ecology and Biogeography BibLaTeX styles for the Biber backend"
DESCRIPTION = "This bundle provides a set of styles for creating \
bibliographies using BibLaTeX in the style of the Global \
Ecology and Biogeography journal. It comprises styles based on \
the conventions of John Wiley & Sons Ltd and Global Ecology and \
Biogeography Conventions (c)."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn39233"

RPM_NAME = "texlive-ecobiblatex-2026.226.1.0svn39233-61.4.noarch.rpm"
RPM_HASH = "a0483fc3776217f00591e5d872b084e4662c48a5666f92c9e5a9cb25d24aa8c72d2ef1d77eb171af4a9ea248f2100b8eee8c60f798bcf066024e8070ab88721f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ecobiblatex.bbx \
tex-ecobiblatex.cbx \
texlive-ecobiblatex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-authoryear-comp.bbx \
tex-authoryear-comp.cbx \
tex-standard.bbx \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
