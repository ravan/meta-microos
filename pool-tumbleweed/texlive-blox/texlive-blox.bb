SUMMARY = "Draw block diagrams, using TikZ"
DESCRIPTION = "This package, along with TikZ, will typeset block diagrams for \
use with programming and control theory. It is an English \
translation of the schemabloc package."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.51svn57949"

RPM_NAME = "texlive-blox-2026.226.2.51svn57949-59.2.noarch.rpm"
RPM_HASH = "89256a9fb0cbe519a659941b90c787e082cf9d9c4e4b03b56c62bd1c50d7feadb15617ee0a5da8a8060b54142fe4e83ef85931534c133a7b1af9f84a9f8267d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-blox.sty \
texlive-blox"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
tex-pgffor.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
