SUMMARY = "BibLaTeX citations for FU Berlin"
DESCRIPTION = "The bundle provides a set of BibLaTeX implementations of \
bibliography and citation styles for the Business \
Administration Department of the Free University of Berlin."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.02svn26556"

RPM_NAME = "texlive-biblatex-bwl-2026.226.0.0.02svn26556-61.2.noarch.rpm"
RPM_HASH = "58cb7e322df0d3dd2cbca1639c91177c74835a200367fe89cbda0ef9a5981068a5a2616430886b2f794cb2d17f8559e216fc18bdcd52fd63fd78336e04faf554"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bwl-FU.bbx \
tex-bwl-FU.cbx \
texlive-biblatex-bwl"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-authoryear.bbx \
tex-authoryear.cbx \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
