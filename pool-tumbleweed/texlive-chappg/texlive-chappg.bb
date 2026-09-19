SUMMARY = "Page numbering by chapter"
DESCRIPTION = "The package provides for 'chapterno-pageno' or \
'chaptername-pageno' page numbering. Provision is made for \
front- and backmatter in book class."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.1bsvn77682"

RPM_NAME = "texlive-chappg-2026.226.2.1bsvn77682-59.2.noarch.rpm"
RPM_HASH = "3146a9b4900842006e58563f6a61a661acb4264dff46bfd34cb27f6878a8dc156b20877465f7358272a614f0f789ddde5f0ee20c543f3dfb0b4d3e6e7024a1c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-chappg.sty \
texlive-chappg"

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
