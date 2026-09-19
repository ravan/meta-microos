SUMMARY = "Macros for creating stretchy TeX symbols"
DESCRIPTION = "This package helps to create 'stretchy' math symbols. It \
provides various ready-made stretchy symbols, as well as \
auxiliary macros for creating them. The package has no \
dependencies and supports both pdfTeX and LuaTeX."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn75140"

RPM_NAME = "texlive-stretchy-2026.226.0.0.1svn75140-64.2.noarch.rpm"
RPM_HASH = "44c819cc49917335228b64ef2fe91eaba52b1d3ec654b3bf0313025388379d0afe567db23148d50153c4591393c2a9d3fdf74bc2991a525367ba17162751cfcd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-stretchy.tex \
tex-strty-logo.tex \
tex-strty-repeatedsyms.tex \
tex-strty-stretchedsyms.tex \
tex-strty-utils.tex \
texlive-stretchy"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
