SUMMARY = "Left indices with better spacing"
DESCRIPTION = "This package provides commands for typesetting left indices. \
Unlike other similar packages, leftindex also indents the left \
superscript, providing much better spacing in general."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2betasvn77682"

RPM_NAME = "texlive-leftindex-2026.226.0.0.2betasvn77682-61.2.noarch.rpm"
RPM_HASH = "8bcd73adeba49fec845df160512b75b2fb4a6cc5d3eade7a11ff885688c2771de853853d55eee8f88ca9956402c7e3454db51037f6c40abe634898d7713d8226"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-leftindex.sty \
texlive-leftindex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-mathtools.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
