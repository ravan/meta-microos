SUMMARY = "Fixed-point real computations to 8 decimals"
DESCRIPTION = "The package provides basic arithmetic operations to 8 decimal \
places for plain TeX or LaTeX. Results are exact when they fit \
within the digit limits. Along with the basic package is an \
optional extension that adds computation of sin, cos, log, \
sqrt, exp, powers and angles. These are also exact when \
theoretically possible and are otherwise accurate to at least 7 \
decimal places. In addition, the package provides a stack-based \
programming environment."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.96svn76924"

RPM_NAME = "texlive-minifp-2026.226.0.0.96svn76924-61.2.noarch.rpm"
RPM_HASH = "d125a228ec8dd049fc9d96afb8409f8793ed1f611c89a4d42d6c475f7b53c0b94fe3b0cee0126828e625fde4b20135179729c857d991b55dbf98cb884eeca8d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mfpextra.tex \
tex-minifp.sty \
texlive-minifp"

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
