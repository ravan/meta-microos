SUMMARY = "Simple floating point arithmetic"
DESCRIPTION = "The package provides simple floating point operations \
(addition, subtraction, multiplication, division and rounding). \
Used, for example, by rccol."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1bsvn56594"

RPM_NAME = "texlive-fltpoint-2026.226.1.1bsvn56594-60.2.noarch.rpm"
RPM_HASH = "7ab7246364eefd5f882a35e6d80185adb4c94ad35f7ba58ad07da0068237747813f15cdf99cf576994b6cb20747a710c0f4b56cb331ae5967ecbf1494889b823"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-deccomma.sty \
tex-fltpoint.sty \
tex-fltpoint.tex \
texlive-fltpoint"

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
