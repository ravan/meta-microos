SUMMARY = "Calligraphic font for typesetting handwriting"
DESCRIPTION = "A calligraphic font for simulating American-style informal \
handwriting. The font is distributed in Adobe Type 1 format."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn61719"

RPM_NAME = "texlive-augie-2026.226.svn61719-60.2.noarch.rpm"
RPM_HASH = "449c6ecf0e446cd3b72ce55982f97cf716d9ea859bca0ac369ead659a28cda64cf311d4d64ea50dbf88c851005b478ddf5f11a722a9c58ddfc9a78e19790fbbe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-augie---.tfm \
tex-augie.map \
tex-augie7t.tfm \
tex-augie7t.vf \
tex-augie8c.tfm \
tex-augie8c.vf \
tex-augie8r.tfm \
tex-augie8t.tfm \
tex-augie8t.vf \
tex-ot1augie.fd \
tex-t1augie.fd \
tex-ts1augie.fd \
texlive-augie"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
texlive \
texlive-augie-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
