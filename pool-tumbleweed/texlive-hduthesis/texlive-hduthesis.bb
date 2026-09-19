SUMMARY = "LaTeX class for bachelor and MPhil theses in Hangzhou Dianzi University"
DESCRIPTION = "This package provides a LaTeX template for graduation theses \
from Hangzhou Dianzi University. It supports the formatting of \
bachelor and MPhil degree theses."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1.1svn76924"

RPM_NAME = "texlive-hduthesis-2026.226.1.1.1svn76924-60.4.noarch.rpm"
RPM_HASH = "f32fd2fc908e2f7ac86e8180a45984697330ca960479b4814397265667c52609a0ea53dedf3ad3576fd8a9fe1538f84f28125e28025af3360c7fe39d630b9809"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-beamerthemehdu.sty \
tex-hdu-bc.config.code.tex \
tex-hdu-exam.code.tex \
tex-hdu-l3doc.code.tex \
tex-hdu-layout.code.tex \
tex-hdu-pg.config.code.tex \
tex-hdu-stationery.code.tex \
tex-hdu-typeset.code.tex \
tex-hduthesis.cls \
texlive-hduthesis"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-anyfontsize.sty \
tex-booktabs.sty \
tex-hyperref.sty \
tex-minted.sty \
tex-ragged2e.sty \
tex-subcaption.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
