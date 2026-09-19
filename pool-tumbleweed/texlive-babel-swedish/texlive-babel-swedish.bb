SUMMARY = "Babel support for typesetting Swedish"
DESCRIPTION = "The package provides the language definition file for Swedish."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.3esvn77682"

RPM_NAME = "texlive-babel-swedish-2026.226.2.3esvn77682-60.2.noarch.rpm"
RPM_HASH = "0ccd25d7d3d4d9cd03700fb4009b1375885e89283438653b2188a7766f8f949b653131d4ad78bee36a935d15ed22b2484d551e0e069be2f2093d13f1513d643e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-swedish.ldf \
texlive-babel-swedish"

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
