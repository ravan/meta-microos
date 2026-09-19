SUMMARY = "Draw tangles, trees, Hopf algebra operations and other pictures"
DESCRIPTION = "A LaTeX2e package for drawing tangles, trees, Hopf algebra \
operations and other pictures. It is based on emTeX or TPIC \
\\specials. Therefore, it can be used with the most popular \
drivers, including emTeX drivers, dviwin, xdvi and dvips, and \
(using some code from ConTeXt) it may also be used with \
pdfLaTeX."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn71991"

RPM_NAME = "texlive-t-angles-2026.226.svn71991-64.2.noarch.rpm"
RPM_HASH = "1628507c9ea5c8e86bc5f243f38dc132fbfc01cd18b9b7566cddfd06e67bb3c5be7e058e137ee8e316b452cd3d6ba58ba75de354f9fb27f80e18f2e4f9df2dd9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-t-angles.sty \
texlive-t-angles"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifpdf.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
