SUMMARY = "Document class and bibliography style for Lecture Notes in Computer Science (LNCS)"
DESCRIPTION = "This is Springer's official macro package for typesetting \
contributions to be published in Springer's Lecture Notes in \
Computer Science (LNCS) and its related proceedings series \
CCIS, LNBIP, LNICST, and IFIP AICT."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.26svn77682"

RPM_NAME = "texlive-llncs-2026.226.2.26svn77682-61.2.noarch.rpm"
RPM_HASH = "bb4252bf424c8867687a0466004374acf5b7ed3607d2479795ea86e89140b792e14fdb29dc755b90b5b720448fb3a5eabe9e9ee9a534d536d01a147dcb9ffca1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-llncs.cls \
texlive-llncs"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-aliascnt.sty \
tex-article.cls \
tex-multicol.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
