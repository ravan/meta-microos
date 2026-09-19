SUMMARY = "Support for Bezier curves"
DESCRIPTION = "Provides additional facilities in a picture environment for \
drawing linear, cubic, and rational quadratic Bezier curves \
(standard LaTeX only offers non-rational quadratic splines). \
Provides a package multiply that provides a command for \
multiplication of a length without numerical overflow."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1bsvn77682"

RPM_NAME = "texlive-bez123-2026.226.1.1bsvn77682-61.2.noarch.rpm"
RPM_HASH = "ae4da1c63bf4cbe0a135f1adab2bc9fc669343c7e25b244a0202468877c84f61c2d67fc7bf932e9d096465f549e8999052fe2f39b1bb9f58e6a411762b25ec5e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bez123.sty \
tex-multiply.sty \
texlive-bez123"

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
