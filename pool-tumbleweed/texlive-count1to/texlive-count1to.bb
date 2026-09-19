SUMMARY = "Make use of count1 to count9"
DESCRIPTION = "A LaTeX package which sets count 1 (to 'absolute' page number), \
counts 2-8 to the numbers of the current \\part, \\chapter \
(always 0 in article class), ... \\subparagraph, and count 9 to \
1 or 0, according to whether the page is odd or even. These \
values can be used to select pages with some drivers. The \
package uses the everyshi package."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.11svn71526"

RPM_NAME = "texlive-count1to-2026.226.2.11svn71526-61.2.noarch.rpm"
RPM_HASH = "e3a703c99e297283e2b0bf34555930c2c2d6583515fc03231ca50737eb1f7d944d599809ed155e3c3eeaeb1338ec3349fa29210a1cb8c785060ad825c51e4b3c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-count1to.sty \
texlive-count1to"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-everyshi.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
