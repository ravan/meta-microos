SUMMARY = "Generate roman numerals instead of arabic digits"
DESCRIPTION = "The romannum package changes LaTeX generated numbers to be \
printed with roman numerals instead of arabic digits. It \
requires the stdclsdv package. Users of the bookhands fonts may \
find this package useful."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0bsvn77682"

RPM_NAME = "texlive-romannum-2026.226.1.0bsvn77682-60.2.noarch.rpm"
RPM_HASH = "7b49c5068e27079f4b8d7ab7465ce5174ad6a9c26d2c112d4c16f390e87cdc1981cf59aaad2dcc1384133931f52d83e8227d54e56f5dafeb2c1536782eecec7e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-romannum.sty \
texlive-romannum"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-stdclsdv.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
