SUMMARY = "A TikZ library for drawing tiles and tilings"
DESCRIPTION = "This package provides a TikZ library for working with tiles, \
tilings, and tessellations. Using it, one can define tiles, \
place tiles, deform tiles, and -- in some cases -- apply \
replacement rules to generate tessellations. It has pre-defined \
tiles for most of the Penrose tile sets and the aperiodical \
polykite tiles. This is a replacement for the penrose package, \
renamed as it now deals with more extensive tiles than just the \
Penrose tile sets."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0svn76924"

RPM_NAME = "texlive-tilings-2026.226.2.0svn76924-59.2.noarch.rpm"
RPM_HASH = "9172ddc12d6cb8a31004aef341f28eae480c4ab5d71d8758fb762b9d752f0fc692499016cffac76d378035d44914211e35503466ff09b9a2321d8d5ca4c3880c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tikzlibrarypenrose.code.tex \
tex-tikzlibrarytilings.code.tex \
tex-tikzlibrarytilings.penrose.code.tex \
tex-tikzlibrarytilings.polykite.code.tex \
texlive-tilings"

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
