SUMMARY = "Manipulate 'soft paths' in PGF"
DESCRIPTION = "The spath3 library provides methods for manipulating the 'soft \
paths' of TikZ/PGF. Packaged with it are two TikZ libraries \
that make use of the methods provided. These are libraries for \
drawing calligraphic paths and for drawing knot diagrams."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.8svn76924"

RPM_NAME = "texlive-spath3-2026.226.2.8svn76924-64.2.noarch.rpm"
RPM_HASH = "efd6adb14fc1f927a98a0f9bd23b4bccc82b1718570511bfdf9bb7e796686b27439d0e6eaa5b2ec3bfc388319e832e57631266ba3b6b9192e6ba2da5461c2927"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-spath3.sty \
tex-tikzlibrarycalligraphy.code.tex \
tex-tikzlibraryknots.code.tex \
tex-tikzlibraryspath3.code.tex \
texlive-spath3"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-pgf.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
