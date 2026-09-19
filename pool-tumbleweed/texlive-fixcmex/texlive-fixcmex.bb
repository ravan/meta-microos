SUMMARY = "Fully scalable version of Computer Modern Math Extension font"
DESCRIPTION = "This package provides a fully scalable version of the Computer \
Modern Math Extension font for curing sizing problems mainly \
with lmodern. It can be used when the main font of the document \
is Computer Modern (or European Modern, if T1 encoding is \
selected), or Latin Modern. It redefines the math extension \
font so that it becomes arbitrarily scalable, using the optical \
size fonts provided by the AMS together with the original \
cmex10 font."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn51825"

RPM_NAME = "texlive-fixcmex-2026.226.1.1svn51825-59.2.noarch.rpm"
RPM_HASH = "4b438f880707e782defe0449955ca16b388a6eab5eba2d37601b22649abc2adcab4a8de1ebf4499d98fda3d88cec32d06f0884ca62566e5c8b515fd7341983ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fixcmex.sty \
texlive-fixcmex"

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
