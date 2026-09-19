SUMMARY = "Support for indexing"
DESCRIPTION = "The package simplifies the indexing of words using the \\index \
command of makeidx. With the package, to index a word in a \
text, you only have to type it once; the package makes sure it \
is both typeset and indexed."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.04asvn77682"

RPM_NAME = "texlive-hvindex-2026.226.0.0.04asvn77682-60.2.noarch.rpm"
RPM_HASH = "e13cdbc896e2d107cb5d58436cbd763a6244845a818e9507ea65a7cf69ed018a8fea0075d2d8ec9bd8d60f0a5c860a99802415e6f5c92ff86f12e8acb1ee76e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hvindex.sty \
texlive-hvindex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-makeidx.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
