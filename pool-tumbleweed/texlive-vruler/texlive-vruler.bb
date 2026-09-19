SUMMARY = "Numbering text"
DESCRIPTION = "The package offers facilities for adding a columns of numbering \
to the general text so that the text can be properly \
referenced. The vertical ruler can be scaled and moved freely. \
The package may be used either with LaTeX or with plain TeX."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.3svn78101"

RPM_NAME = "texlive-vruler-2026.226.2.3svn78101-60.2.noarch.rpm"
RPM_HASH = "7445df6b5166a47560eb6fce8ab874f684a1748f3274196b9f144e9b9ad20032b3e3a9b63d4ffbd247b4c584bb5cea6d10d7be82c07d8779f186f8d2f0b92150"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-vruler.sty \
texlive-vruler"

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
