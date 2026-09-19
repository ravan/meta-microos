SUMMARY = "Use ditaa diagrams within LaTeX documents"
DESCRIPTION = "With this package ditaa (DIagrams Through Ascii Art) diagrams \
can be embedded directly into LaTeX files."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.9svn48932"

RPM_NAME = "texlive-ditaa-2026.226.0.0.9svn48932-59.2.noarch.rpm"
RPM_HASH = "ee3935788774e58b22b42a46c7989102b2088fcb9479ae5a0b201a2b11b799ee0df0db89190cbb1eba97b57af9731d0f17b1ec36ba8f64d172006ae6a55d114c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ditaa.sty \
texlive-ditaa"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fancyvrb.sty \
tex-graphicx.sty \
tex-kvoptions.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
