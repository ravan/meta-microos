SUMMARY = "Three series of mathematical symbols"
DESCRIPTION = "Mathabx is a set of 3 mathematical symbols font series: matha, \
mathb and mathx. They are defined by Metafont code and should \
be of reasonable quality (bitmap output). Things change from \
time to time, so there is no claim of stability (encoding, \
metrics, design). The package includes Plain TeX and LaTeX \
support macros. A version of the fonts, in Adobe Type 1 format, \
is also available."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-mathabx-2026.226.svn77682-59.2.noarch.rpm"
RPM_HASH = "4cb287893446e4bda70923b953ad1e23bd873e78ba9b06439330aa45c6477496125a6d4c4002d1a363db1012db54cca4040ec5cb5bb707ede38e90da4148b292"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-matha10.tfm \
tex-matha12.tfm \
tex-matha5.tfm \
tex-matha6.tfm \
tex-matha7.tfm \
tex-matha8.tfm \
tex-matha9.tfm \
tex-mathabx.sty \
tex-mathabx.tex \
tex-mathastrotest10.tfm \
tex-mathb10.tfm \
tex-mathb12.tfm \
tex-mathb5.tfm \
tex-mathb6.tfm \
tex-mathb7.tfm \
tex-mathb8.tfm \
tex-mathb9.tfm \
tex-mathc10.tfm \
tex-mathu10.tfm \
tex-mathux10.tfm \
tex-mathx10.tfm \
tex-mathx12.tfm \
tex-mathx5.tfm \
tex-mathx6.tfm \
tex-mathx7.tfm \
tex-mathx8.tfm \
tex-mathx9.tfm \
texlive-mathabx"

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
