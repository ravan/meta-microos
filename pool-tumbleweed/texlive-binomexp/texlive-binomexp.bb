SUMMARY = "Calculate Pascal's triangle"
DESCRIPTION = "The package calculates and prints rows of Pascal's triangle. It \
may be used: simply to print successive rows of the triangle, \
or to print the rows inside an array or tabular."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn15878"

RPM_NAME = "texlive-binomexp-2026.226.1.0svn15878-61.2.noarch.rpm"
RPM_HASH = "2a724a577f8bf62734883503d3d0b501225ee4c0cc5c65f7b6cfc75cacb2008b1720cedd2273bb8fbdc2f77841065625b66b8a08e993d2ad5e35b03635c96962"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-binomexp.sty \
texlive-binomexp"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
