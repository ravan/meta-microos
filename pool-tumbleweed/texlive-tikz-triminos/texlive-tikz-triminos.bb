SUMMARY = "Create triminos, made with TikZ"
DESCRIPTION = "Create (1 or 9 or 12) TriMinos with some customizations: size, \
font, logo, colors; automatic texts adjustment; full version, \
or joker usage. Inspiration from Paul Matthies"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1.0svn73533"

RPM_NAME = "texlive-tikz-triminos-2026.226.0.0.1.0svn73533-59.2.noarch.rpm"
RPM_HASH = "f91b6baf9156f44b8921a3054a3d28ec30144a81881d3e0e1a9160e9764404ec202c01416ad78ca404c7ea4a2d051a83e79fc0c8836203f221dca5f8b14048fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tikz-triminos.sty \
texlive-tikz-triminos"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fontawesome5.sty \
tex-ifthen.sty \
tex-listofitems.sty \
tex-settobox.sty \
tex-simplekv.sty \
tex-tikz.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
