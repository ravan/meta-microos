SUMMARY = "Typeset EAN barcodes using TeX rules, only"
DESCRIPTION = "The (LaTeX3) package typesets EAN-8 and EAN-13 barcodes, using \
the facilities of the rule-D package."
LICENSE = "LPPL-1.0"

PV = "2026.226.23svn76924"

RPM_NAME = "texlive-gs1-2026.226.23svn76924-60.4.noarch.rpm"
RPM_HASH = "7eccec277e3eb07fb43613b36645eb9d743e3d147d5351025eb8be0033b30697638b1827cefd539ed0f1e022a5dccc8e63bb4157ca27d243e0087f0453bbba05"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-GS1.sty \
tex-rule-D.sty \
texlive-gs1"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
