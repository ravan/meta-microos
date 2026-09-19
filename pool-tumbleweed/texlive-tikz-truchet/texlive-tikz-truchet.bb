SUMMARY = "Draw Truchet tiles"
DESCRIPTION = "This is a package for LaTeX that draws Truchet tiles, as used \
in Colin Beveridge's article Too good to be Truchet in issue 08 \
of Chalkdust."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn50020"

RPM_NAME = "texlive-tikz-truchet-2026.226.svn50020-59.2.noarch.rpm"
RPM_HASH = "228b01818bd1ed902d133c663b759c48a5090d37dd4bb726e839ce5958cb0f50e7d7070a1b403fbd2f9c94e08aa33883ac193f0433c3d24c55a34b8474448021"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tikz-truchet.sty \
texlive-tikz-truchet"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
