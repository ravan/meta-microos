SUMMARY = "2D and 3D TeX-Aware Vector Graphics Language"
DESCRIPTION = "Asymptote is a powerful descriptive vector graphics language \
for technical drawing, inspired by MetaPost but with an \
improved C++-like syntax. Asymptote provides for figures the \
same high-quality level of typesetting that LaTeX does for \
scientific text."
LICENSE = "LGPL-3.0-or-later"

PV = "2026.226.3.09svn78154"

RPM_NAME = "texlive-asymptote-2026.226.3.09svn78154-60.2.noarch.rpm"
RPM_HASH = "ea63ae14e7b28cf926ffd1b589a8a9c4c4d657fd799664e675226b2f88e534223cd178762fd62085b0e65053a1654370ac67327bebfb322d8f4782167dbdc700"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-asycolors.sty \
tex-asymptote.sty \
tex-colo-asy.tex \
tex-ocg.sty \
texlive-asymptote"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
python3-tk \
sed \
tex-catchfile.sty \
tex-color.sty \
tex-graphicx.sty \
tex-ifpdf.sty \
tex-ifthen.sty \
tex-ifxetex.sty \
tex-keyval.sty \
texlive \
texlive-asymptote-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-media9 \
texlive-movie15 \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
