SUMMARY = "Draw trees with more than one root node, using PSTricks"
DESCRIPTION = "The package uses PSTricks to draw trees with more than one root \
node. It is similar to pst-tree, though it uses a different \
placement algorithm."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.02svn77256"

RPM_NAME = "texlive-pst-tvz-2026.226.1.02svn77256-60.4.noarch.rpm"
RPM_HASH = "4b1181e3e43d374577359d5c8f0bc64e311f104a33fba9aa28161f5420d85df9bcab0f4e0e9bf95973b49c420deaa043edf2ca20a6a0dbaa0fa88aa4c062f199"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-tvz.sty \
tex-pst-tvz.tex \
texlive-pst-tvz"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
