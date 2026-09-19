SUMMARY = "Correct spacing of the alignment in expressions"
DESCRIPTION = "This package realigns the horizontal spacing of the alignments \
in some mathematical environments."
LICENSE = "BSD-3-Clause"

PV = "2026.226.1.1svn44131"

RPM_NAME = "texlive-correctmathalign-2026.226.1.1svn44131-61.2.noarch.rpm"
RPM_HASH = "56c3336cd1c02e1577f1f3aeafcf23241c31061589f8ba82d109cb4cab193dae8aaeeae113bcfbd59faf137849fc10387d717355f1d842430bcecce7bd2be51e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-correctmathalign.sty \
texlive-correctmathalign"

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
