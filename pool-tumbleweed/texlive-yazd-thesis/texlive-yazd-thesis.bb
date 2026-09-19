SUMMARY = "A template for the Yazd University"
DESCRIPTION = "This package offers a document class for typesetting theses and \
dissertations at the Yazd University. The class requires use of \
XeLaTeX."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3svn61719"

RPM_NAME = "texlive-yazd-thesis-2026.226.0.0.3svn61719-59.4.noarch.rpm"
RPM_HASH = "d345ba6527228741cb489ad3bb6838983a1f835456927ab30f02034ceeebe5c60f7ec90f0008f0e43839d494c89a745d303e22042fcc9db65b97ff928e2353ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-yazd-thesis.cls \
texlive-yazd-thesis"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-amssymb.sty \
tex-amsthm.sty \
tex-array.sty \
tex-book.cls \
tex-calc.sty \
tex-fancyhdr.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-makeidx.sty \
tex-multicol.sty \
tex-tocbibind.sty \
tex-xcolor.sty \
tex-zref-perpage.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
