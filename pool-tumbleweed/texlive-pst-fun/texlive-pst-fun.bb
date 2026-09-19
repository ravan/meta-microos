SUMMARY = "Draw 'funny' objects with PSTricks"
DESCRIPTION = "This is a PSTricks related package for drawing funny objects, \
like ant, bird, fish, kangaroo, ... Such objects may be useful \
for testing other PSTricks macros and/or packages. (Or they can \
be used for fun...)"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.04svn17909"

RPM_NAME = "texlive-pst-fun-2026.226.0.0.04svn17909-59.2.noarch.rpm"
RPM_HASH = "fd9625ac9594c3b04ea28fb280d286768cb3b34da30667e2e8557e59c656a38d8e593dec73fa75f884d4368e4e23fc88ffa2a40a6535d60c49aac34888bdec8c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-fun.sty \
tex-pst-fun.tex \
texlive-pst-fun"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-multido.sty \
tex-pst-grad.sty \
tex-pst-slpe.sty \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
