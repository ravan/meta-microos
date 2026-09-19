SUMMARY = "Work with PixelArts, with TikZ"
DESCRIPTION = "The package defines commands and an environment for displaying \
pixel arts."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.20asvn77054"

RPM_NAME = "texlive-pixelarttikz-2026.226.0.0.20asvn77054-58.2.noarch.rpm"
RPM_HASH = "fbb574f4619b1302fbadf7786cd39e54ab87203d87d7668a41d7b4bef0bd52e219e66bf9ca5264b85e6cda955dee31a35871db9d46d16b7f2ea462bf4f6ad0bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-PixelArtTikz.sty \
tex-pixelarttikz-l3.sty \
texlive-pixelarttikz"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-csvsimple.sty \
tex-datatool.sty \
tex-expl3.sty \
tex-ifthen.sty \
tex-l3keys2e.sty \
tex-listofitems.sty \
tex-multicol.sty \
tex-simplekv.sty \
tex-tabularray.sty \
tex-tikz.sty \
tex-xintexpr.sty \
tex-xinttools.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
