SUMMARY = "Multiple mathematical accents"
DESCRIPTION = "A package for multiple accents in mathematics, with nice \
features concerning the creation of accents and placement of \
scripts."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4svn77682"

RPM_NAME = "texlive-accents-2026.226.1.4svn77682-61.2.noarch.rpm"
RPM_HASH = "c6c8342ddf2f35b31d188692b50d130121668aad1d34e9861d6056c91f0471648c9b07abd4b739490571d68a7e46e520f27f82a39ed40214a8178e09102ff833"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-accents.sty \
texlive-accents"

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
