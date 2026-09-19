SUMMARY = "Carbohydrate molecules with chemfig"
DESCRIPTION = "This package offers macros that make the preparation of \
exercise sheets for teaching carbohydrate chemistry a lot less \
tedious. It uses chemfig for drawing the formulas. Different \
representation models (Fischer, Haworth, chair...) are \
supported as well as alpha, beta, and chain isomers."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn39000"

RPM_NAME = "texlive-carbohydrates-2026.226.0.0.1svn39000-59.2.noarch.rpm"
RPM_HASH = "718134d6b0faa63440cc4dd68a8c6a6c8100c330cbed565a877703ba2d731184be1e3e1db5d57a4a0615ddcf1d3637ab2e1ac3d56774d74e74aebd53c603537c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-carbohydrates.sty \
texlive-carbohydrates"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-chemfig.sty \
tex-etoolbox.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
