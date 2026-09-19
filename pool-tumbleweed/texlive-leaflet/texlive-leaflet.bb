SUMMARY = "Create small handouts (flyers)"
DESCRIPTION = "A document class to create small hand-outs (flyers) that fit on \
a single sheet of paper which is then folded twice. Pages are \
rearranged by LaTeX so that they print correctly on a single \
sheet -- no external script is necessary. (Works with \
PostScript and PDF.) This is a complete reimplementation with \
permission of the original author Jurgen Schlegelmilch."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.1csvn77682"

RPM_NAME = "texlive-leaflet-2026.226.2.1csvn77682-61.2.noarch.rpm"
RPM_HASH = "9ff814914c599be70ff839a14d2f9f88d9d607d3a3307f3a42d5901531f89c616dd26a77fd48c16d690f4fec393ff154afd2c9c51b6d3d6f8cf08f034eeaad52"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-leaflet.cls \
texlive-leaflet"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-etex.sty \
tex-graphicx.sty \
tex-pifont.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
