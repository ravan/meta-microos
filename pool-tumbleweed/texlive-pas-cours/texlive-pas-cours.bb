SUMMARY = "Macros useful in preparing teaching material"
DESCRIPTION = "Several groups of macros cover different branches of \
mathematics."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.9svn55859"

RPM_NAME = "texlive-pas-cours-2026.226.1.9svn55859-58.2.noarch.rpm"
RPM_HASH = "4500b30f32351ebea6a410b253265dcdc9afd336f165325453e4c00d7168aea1457a9e71678a8a73e7659c48212f5d1d1f8a9842e57a93fe393d58cd1df05631"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-macro-calculs.tex \
tex-macro-patrons.tex \
tex-macro-solides.tex \
tex-macro-styles.tex \
tex-pas-cours.sty \
texlive-pas-cours"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amssymb.sty \
tex-auto-pst-pdf.sty \
tex-enumitem.sty \
tex-fancyvrb.sty \
tex-ifplatform.sty \
tex-numprint.sty \
tex-pst-plot.sty \
tex-tikz.sty \
tex-xkeyval.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
