SUMMARY = "A flexible and customizable LaTeX theme for creating professional presentations"
DESCRIPTION = "The NovaBeamer Theme is a LaTeX Beamer theme that offers \
customizable color schemes, modern slide layouts, and enhanced \
title page customization for creating elegant and professional \
presentations."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn76924"

RPM_NAME = "texlive-novabeamer-theme-2026.226.1.0svn76924-61.2.noarch.rpm"
RPM_HASH = "e2fbe6be410d233ab091980b1f6364011cfa315177ac6abd904fb870d12307e4e03b67159cb54d76947b7ed66acaaf430f10d85b17c1631be19e8934f6459192"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-novabeamer.sty \
texlive-novabeamer-theme"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-comment.sty \
tex-graphicx.sty \
tex-tikz.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
