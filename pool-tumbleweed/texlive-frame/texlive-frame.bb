SUMMARY = "Framed boxes for Plain TeX"
DESCRIPTION = "A jiffy file (taken from fancybox) for placing a frame around a \
box of text. The macros also provide for typesetting an empty \
box of given dimensions."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn18312"

RPM_NAME = "texlive-frame-2026.226.1.0svn18312-60.2.noarch.rpm"
RPM_HASH = "969e9b70a3e1d2e5ad7e3663932ab21332313bbf3640220eeb202e13457a58a0fe911870eda814d34b749017e188bb2585b2d48559e1727b7a79a176bbb36f66"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-frame.sty \
tex-frame.tex \
texlive-frame"

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
