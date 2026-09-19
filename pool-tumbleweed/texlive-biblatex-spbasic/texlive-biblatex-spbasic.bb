SUMMARY = "A BibLaTeX style emulating Springer's old spbasic.bst"
DESCRIPTION = "This package provides a bibliography and citation style for \
BibLaTeX/biber for typesetting articles for Springer's \
journals. It is the same as the old BibTeX style spbasic.bst."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.04svn61439"

RPM_NAME = "texlive-biblatex-spbasic-2026.226.0.0.04svn61439-61.2.noarch.rpm"
RPM_HASH = "d175fcd0258d1ed9e0b1fcb7436fc1a159eac8d2c60e23c5140f5311fec62734efd57bd1ad702149778f7bfc08bdc71ff7db913a7626fbc4f6924caa20b35c7b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-biblatex-spbasic.bbx \
tex-biblatex-spbasic.cbx \
tex-biblatex-spbasic.lbx \
texlive-biblatex-spbasic"

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
