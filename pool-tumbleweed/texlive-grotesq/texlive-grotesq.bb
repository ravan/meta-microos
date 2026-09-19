SUMMARY = "URW Grotesq font pack for LaTeX"
DESCRIPTION = "The directory contains a copy of the Type 1 font 'URW Grotesq \
2031 Bold' released under the GPL by URW, with supporting files \
for use with (La)TeX."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn35859"

RPM_NAME = "texlive-grotesq-2026.226.svn35859-60.4.noarch.rpm"
RPM_HASH = "84fef185a46eeb011967c3b4743c7e39a706f6bfa076778124200791f2ff7d523e4084199a8f43b51d70ca6f4515590f9f411c8ca3c62970ec85be0a848138ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ot1ugq.fd \
tex-t1ugq.fd \
tex-ts1ugq.fd \
tex-ugq.map \
tex-ugqb7t.tfm \
tex-ugqb7t.vf \
tex-ugqb8a.tfm \
tex-ugqb8c.tfm \
tex-ugqb8c.vf \
tex-ugqb8r.tfm \
tex-ugqb8t.tfm \
tex-ugqb8t.vf \
tex-ugqbo7t.tfm \
tex-ugqbo7t.vf \
tex-ugqbo8c.tfm \
tex-ugqbo8c.vf \
tex-ugqbo8r.tfm \
tex-ugqbo8t.tfm \
tex-ugqbo8t.vf \
texlive-grotesq"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
texlive \
texlive-filesystem \
texlive-grotesq-fonts \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
