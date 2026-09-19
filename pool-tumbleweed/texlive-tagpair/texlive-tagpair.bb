SUMMARY = "Word-by-word glosses, translations, and bibliographic attributions"
DESCRIPTION = "This package provides environments and commands for pairing \
lines, bottom lines, and tagged lines, intended to be used in \
particular for word-by-word glosses, translations, and \
bibliographic attributions, respectively. This LaTeX package is \
inspired by Marcel R. van der Goot's classic Plain TeX macros \
in gloss.tex."
LICENSE = "LPPL-1.0"

PV = "2026.227.1.1svn42138"

RPM_NAME = "texlive-tagpair-2026.227.1.1svn42138-62.2.noarch.rpm"
RPM_HASH = "8a1e860f34af96b5dbd98bdb2b230f1a8c46c198497ec8d30a70774cd2c2afd490c397b0fadefaaddedec0c8121fb3d8cd651d0586a2ab3fa791ee2b7addff8a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tagpair.sty \
texlive-tagpair"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-varwidth.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
