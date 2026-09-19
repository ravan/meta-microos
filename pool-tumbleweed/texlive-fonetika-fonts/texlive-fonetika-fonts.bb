SUMMARY = "Severed fonts for texlive-fonetika"
DESCRIPTION = "The  separated fonts package for texlive-fonetika"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn21326"

RPM_NAME = "texlive-fonetika-fonts-2026.226.svn21326-60.2.noarch.rpm"
RPM_HASH = "c26dd5459026e12c77bd44bb015a57c2031bcff658b3275cfde3ed00cb678cde1ba109b1a0153931676800eb2535b01c9f359f21c1a6f8b71ae789f22ff72194"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-texlive-fonetika-fonts \
font-fonetikadaniaiwonae \
font-fonetikadaniapallae \
texlive-fonetika-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
