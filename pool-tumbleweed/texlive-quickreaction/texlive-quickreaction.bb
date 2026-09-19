SUMMARY = "A simple and fast way to typeset chemical reactions"
DESCRIPTION = "This package provides the quickreaction environment and the \
\\quickarrow command to simplify the typesetting of chemical \
reactions. It is based on the TikZ matrix of nodes and aligns \
all the reactants and products at the center of the TikZ box in \
which they are contained."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.02.01svn66867"

RPM_NAME = "texlive-quickreaction-2026.226.1.02.01svn66867-60.4.noarch.rpm"
RPM_HASH = "b6aba3e3efbed6cede99a4e6f7e4ff7eecc3f4327e06409a044d5f3a8007bb4090028716b5a4e2ded205b7e6117eeba2d24c80bfc4e00a10e28b1e7795cf116d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-quickreaction.sty \
texlive-quickreaction"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-tikz.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
