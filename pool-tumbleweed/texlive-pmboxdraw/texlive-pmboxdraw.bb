SUMMARY = "Poor man's box drawing characters"
DESCRIPTION = "This package declares box drawing characters of old code pages, \
e.g. cp437. It uses rules instead of using a font."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4svn77682"

RPM_NAME = "texlive-pmboxdraw-2026.226.1.4svn77682-59.2.noarch.rpm"
RPM_HASH = "52db6ab20d9098cdf6f193b5311bca68999b2339339c0dfb9dd9454fcae72189fbd9e82a2a548d15a381d7676ca4020b8d1e37736b9bad54a2945f009d065b44"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pmboxdraw.sty \
texlive-pmboxdraw"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-kvoptions.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
