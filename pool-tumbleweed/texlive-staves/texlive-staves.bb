SUMMARY = "Typeset Icelandic staves and runic letters"
DESCRIPTION = "This package contains all the necessary tools to typeset the \
'magical' Icelandic staves plus the runic letters used in \
Iceland. Included are a font in Adobe Type 1 format and LaTeX \
support."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-staves-2026.226.svn15878-64.2.noarch.rpm"
RPM_HASH = "b08984d5379790af6648ba0979eccddbf25283d8f9c5c40ce23b1bf8411591d16f92cdb50465ea7a9c33479dd0bc60634e192c7cef7a1a7d7d327260c3a3cbe7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-icelandic.map \
tex-icelandic.tfm \
tex-staves.sty \
texlive-staves"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-staves-fonts"

inherit rpm
