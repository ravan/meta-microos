SUMMARY = "LaTeX package for drawing karnaugh maps with up to 6 variables"
DESCRIPTION = "This package draws karnaugh maps with 2, 3, 4, 5, and 6 \
variables. It also contains commands for filling the karnaugh \
map with terms semi-automatically or manually. Last but not \
least it contains commands for drawing implicants on top of the \
map. This package depends on the keyval, kvoptions, TikZ, \
xparse, and xstring packages."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0svn61614"

RPM_NAME = "texlive-karnaugh-map-2026.226.2.0svn61614-63.2.noarch.rpm"
RPM_HASH = "75c644339ad8a2c10d53f435a574b2bd15985a7b1a67e6602d8878ada724335869a502a1bfb8bb6ca111a80d5af31b6ae1fcccc1edaaae5db933241ca99794fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-karnaugh-map.sty \
texlive-karnaugh-map"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-keyval.sty \
tex-kvoptions.sty \
tex-tikz.sty \
tex-xparse.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
