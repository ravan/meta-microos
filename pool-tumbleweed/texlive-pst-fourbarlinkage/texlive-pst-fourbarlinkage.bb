SUMMARY = "Draw articulated quadrilaterals"
DESCRIPTION = "An Articulated Quadrilateral is a four-bar linkage mechanism \
(four rods connected by hinges) that changes shape as its \
joints move, creating complex, predictable motions used in \
machines like pedal cranks, lamps, and even for generating \
curves, functioning as a simple, one-degree-of-freedom system \
with fascinating, non-intuitive movements and applications in \
engineering."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.01svn77161"

RPM_NAME = "texlive-pst-fourbarlinkage-2026.226.0.0.01svn77161-59.2.noarch.rpm"
RPM_HASH = "cfe91b0408218d0cfd53ba4a7bb31f0d6f100c0abf978e20bb13d51f886e277d215df3435c7079e61b1529b911f2b35f0ba61b7429cfe621a5bd9723449d5b36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-fourbarlinkage.sty \
tex-pst-fourbarlinkage.tex \
texlive-pst-fourbarlinkage"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
