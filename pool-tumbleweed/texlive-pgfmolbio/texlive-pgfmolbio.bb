SUMMARY = "Draw graphs typically found in molecular biology texts"
DESCRIPTION = "The package draws graphs typically found in molecular biology \
texts. Currently, the package contains modules for drawing DNA \
sequencing chromatograms and protein domain diagrams."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.21asvn71551"

RPM_NAME = "texlive-pgfmolbio-2026.226.0.0.21asvn71551-58.2.noarch.rpm"
RPM_HASH = "e52d29b7de1ffd9fe3d10420267c33b6beee28f25f6a227ff0d1c5aaa7b823aa69e51d3c966fb387d2a736f4af47fb7fc2583f437db7c36870266025b25d9952"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pgfmolbio.chromatogram.tex \
tex-pgfmolbio.convert.tex \
tex-pgfmolbio.domains.tex \
tex-pgfmolbio.sty \
texlive-pgfmolbio"

RDEPENDS:${PN} += "/usr/bin/luatex \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifluatex.sty \
tex-luatexbase-modutils.sty \
tex-tikz.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
