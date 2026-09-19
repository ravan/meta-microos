SUMMARY = "A Gentle Introduction to TeX"
DESCRIPTION = "The 'Gentle Introduction' is the longest-established \
comprehensive free tutorial on the use of plain TeX."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-gentle-2026.226.svn15878-60.2.noarch.rpm"
RPM_HASH = "b54befd2e435fa87b81951f0b6dd9c728c31163aded514389315de2034eff0e3900d9662472184cc567a9c10e9e925c6883c684092e5b79eedcf25157201fbc9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gentle"

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
