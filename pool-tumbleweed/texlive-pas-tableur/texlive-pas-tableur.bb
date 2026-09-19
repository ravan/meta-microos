SUMMARY = "Create a spreadsheet layout"
DESCRIPTION = "The package provides commands for creating a grid of \
rectangles, and commands for populating locations in the grid. \
PGF/TikZ is used for placement and population of the cells."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.06svn72283"

RPM_NAME = "texlive-pas-tableur-2026.226.2.06svn72283-58.2.noarch.rpm"
RPM_HASH = "d0d1bdc00385a651a19d55d754167c761d3240a985ca00e683d271844313316137a43020de8eb11c3564016a8c78eb16f25d1d04bb036cde25f5ecabfa4ed076"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pas-tableur.sty \
texlive-pas-tableur"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-tikz.sty \
tex-xkeyval.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
