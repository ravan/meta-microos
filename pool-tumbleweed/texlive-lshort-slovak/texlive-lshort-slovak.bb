SUMMARY = "Slovak introduction to LaTeX"
DESCRIPTION = "A Slovak translation of Oetiker's (not so) short introduction."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-lshort-slovak-2026.226.svn15878-59.2.noarch.rpm"
RPM_HASH = "9d2878c6e1bc74daf2e1d77cf16761f1a4818dc689ad62d8b8d44ac98cc7cb4d77257dda4e8a421e2596eabdae0aedbe8aebacd0dd5f9c7e4cebe74e2d2d93e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lshort-slovak"

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
