SUMMARY = "Several versions of output from the same source"
DESCRIPTION = "This package allows to generate several versions of the same \
document for different audiences."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.04svn77682"

RPM_NAME = "texlive-multiaudience-2026.226.1.04svn77682-61.2.noarch.rpm"
RPM_HASH = "7c4aac9abe176d804221a64bb6a568195a6453e9570fee7e653e7ec4eaed963be0d3677b96199803dfb8f037ee7e4291b488cdee12ea0390d7a1aad1a71fbe97"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-multiaudience.sty \
texlive-multiaudience"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-environ.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
