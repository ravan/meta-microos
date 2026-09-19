SUMMARY = "Helps to draw codeblocks like scratch, NEPO and PXT in TikZ"
DESCRIPTION = "tikzcodeblocks is a LaTeX package for typesetting blockwise \
graphic programming languages like scratch, nepo or pxt."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.13svn54758"

RPM_NAME = "texlive-tikzcodeblocks-2026.226.0.0.13svn54758-59.2.noarch.rpm"
RPM_HASH = "185425a84835f2bad0ed8bf4e5f101e5b950aa6ce447c8ec03bc196593674c87951739be1710d7c67ec870ffc633414e4b9bea94bde175a7bd8d61f6b33e3c52"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tikzcodeblocks.sty \
texlive-tikzcodeblocks"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-adjustbox.sty \
tex-colortbl.sty \
tex-fontawesome.sty \
tex-ifthen.sty \
tex-longtable.sty \
tex-tikz.sty \
tex-translations.sty \
tex-xcolor.sty \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
