SUMMARY = "'Sacred Symbols' prepared with TikZ"
DESCRIPTION = "The author tells us: This is 'a package with symbols prepared \
with TikZ. These symbols are the variables used in the space of \
the collapse of the wave function of a quantum field associated \
with the micro-tubule while exploring an Orchestrated, \
objective reduction (Orch OR) theory of consciousness as \
applied to the three brains model of psychological experience.'"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn65768"

RPM_NAME = "texlive-sacsymb-2026.226.svn65768-60.2.noarch.rpm"
RPM_HASH = "481abb94071150ec5f6776c6b48cf9a4ff3e5b63b42a2be091da17d6af52c6b7c5d01bcbee6b9f3f0560a7c227b47c9e81c389f1317f18329fba8cf17b425732"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-sacsymb.sty \
texlive-sacsymb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
