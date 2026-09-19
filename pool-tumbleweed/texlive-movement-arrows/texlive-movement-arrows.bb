SUMMARY = "Drawing movement arrows on linguistic example sentences"
DESCRIPTION = "This package supplies simple support for drawing movement \
arrows on example sentences. It automatically adjusts spacing \
between examples or gloss lines to make room for the arrows. \
Arrows can also be annotated with labels. The package uses TikZ \
as a base, and various properties of the arrows can be adjusted \
using TikZ styles. The package has been tested with the gb4e, \
linguex, and ExPex example packages."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0svn67270"

RPM_NAME = "texlive-movement-arrows-2026.226.2.0svn67270-61.2.noarch.rpm"
RPM_HASH = "8cebe476b082d81f57bc816d4d7d0e121783ebdc2ca4ea8d119997ec1d7344ff58385fb9108f094876f1e7c33af9d387da93c45cbb8fc83e957ce779b236ccc7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-movement-arrows.sty \
texlive-movement-arrows"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-etoolbox.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
