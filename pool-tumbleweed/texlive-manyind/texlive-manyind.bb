SUMMARY = "Provides support for many indexes"
DESCRIPTION = "This package provides support for many indexes, leaving all the \
bookkeeping to LaTeX and makeindex. No extra programs or files \
are needed. One runs latex and makeindex as if there is just \
one index. In the main file one puts commands like \
\\setindex{main} to steer the flow. Some features of makeindex \
may no longer work."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn49874"

RPM_NAME = "texlive-manyind-2026.226.svn49874-59.2.noarch.rpm"
RPM_HASH = "4f460db82914729e72224f811ac36644f009b62dc0db95404d9f74efdf208a99ca7c4b5f1e01f4fbd68d13e6c38532fca3df3fd7bcf6fd6b3520fc8dc3be4ca8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-manyind.sty \
texlive-manyind"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-makeidx.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
