SUMMARY = "Provides cover page and affirmation at the end of a thesis"
DESCRIPTION = "Institutions require a cover page and an affirmation at the end \
of a thesis. This package provides both."
LICENSE = "LPPL-1.0"

PV = "2026.226.4.0.2svn47923"

RPM_NAME = "texlive-scientific-thesis-cover-2026.226.4.0.2svn47923-60.2.noarch.rpm"
RPM_HASH = "e856f6bb57ebfb7212c785949e9142249d41daf18b0e055bf5184f66fe8188a997ea9c0e034dd4312484060d290cac8dcd69129a72dddb81260bd44c11f620df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-scientific-thesis-cover.sty \
texlive-scientific-thesis-cover"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
tex-kvoptions.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
