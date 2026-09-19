SUMMARY = "Environment for vertical centring"
DESCRIPTION = "The environment will centre text, if immediately preceded and \
followed by \\clearpage."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1asvn77682"

RPM_NAME = "texlive-midpage-2026.226.1.1asvn77682-61.2.noarch.rpm"
RPM_HASH = "db53f8c6cb7bab0083f7a1ac12c358257e58b12600ed275f77aa9673854c770180fbc4cee1639b2f2bd226ba69ffa933c6647fc7d25a30b2105df3b67035adc0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-midpage.sty \
texlive-midpage"

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
