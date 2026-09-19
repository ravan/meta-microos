SUMMARY = "Martin Vogel's Symbols (marvosym) font"
DESCRIPTION = "Martin Vogel's Symbol font (marvosym) contains the Euro \
currency symbol as defined by the European commission, along \
with symbols for structural engineering; symbols for steel \
cross-sections; astronomy signs (sun, moon, planets); the 12 \
signs of the zodiac; scissor symbols; CE sign and others. The \
package contains both the original TrueType font and the \
derived Type 1 font, together with support files for TeX \
(LaTeX)."
LICENSE = "OFL-1.1"

PV = "2026.226.2.2asvn77682"

RPM_NAME = "texlive-marvosym-2026.226.2.2asvn77682-59.2.noarch.rpm"
RPM_HASH = "f710e75cfb47436aa07ce43c83939ad22197c8c6f79514ae5350a5c208ebca285ab6e75c372c2d7e72dcf96f534263a0d84c085fcdcc84db143875ec92ca9e70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-marvosym.map \
tex-marvosym.sty \
tex-umvs.fd \
tex-umvs.tfm \
texlive-marvosym"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-marvosym-fonts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
