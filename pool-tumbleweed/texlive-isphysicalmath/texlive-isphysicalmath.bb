SUMMARY = "Simple way to write nice formulas"
DESCRIPTION = "This package helps users to write mathematical and physical \
contents according to scientific notation (international \
mainly), in an elegant way. It deals with the notation and \
formatting of formulas, quantities, numerical values, factors, \
dimensions, measurement units and also performs its activities \
in complex mathematical environments."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0.0svn73239"

RPM_NAME = "texlive-isphysicalmath-2026.226.2.0.0svn73239-63.2.noarch.rpm"
RPM_HASH = "a01f33575456ce985250a0bcb4d6a9de3c75044defb72d197f73ea4a2d0c0c0f1ec71a4d8f0dd8aa27b6bb32b440b645a7d7256a24e307b3cfaa215db38e9dcd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-isphysicalmath.sty \
texlive-isphysicalmath"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
