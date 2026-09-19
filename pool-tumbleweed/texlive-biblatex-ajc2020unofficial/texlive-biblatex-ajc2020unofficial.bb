SUMMARY = "BibLaTeX style for the Australasian Journal of Combinatorics"
DESCRIPTION = "This is an unofficial BibLaTeX style for the Australasian \
Journal of Combinatorics. Note that the journal (as for 01 \
March 2020) does not accept BibLaTeX, so you probably want to \
use biblatex2bibitem."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2.0svn54401"

RPM_NAME = "texlive-biblatex-ajc2020unofficial-2026.226.0.0.2.0svn54401-61.2.noarch.rpm"
RPM_HASH = "a9934dba8277f0ab9134c0849731cb059e23477ca2bb4c477287160da8ce9e26d72c2afecc6d0d927438cb8c9abea69f8a5e7fb2a38fbd4ca1600e1415dffd14"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ajc2020unofficial.bbx \
tex-ajc2020unofficial.cbx \
texlive-biblatex-ajc2020unofficial"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-numeric.bbx \
tex-numeric.cbx \
tex-shortmathj.sty \
tex-standard.bbx \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
