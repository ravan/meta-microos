SUMMARY = "Schematic diagrams of lakes"
DESCRIPTION = "This package contains a collection of schematic diagrams of \
lakes for use in LaTeX documents. Diagrams include \
representations of material budgets, fluxes, and connectivity \
arrangements."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn55288"

RPM_NAME = "texlive-tikz-lake-fig-2026.226.1.0svn55288-59.2.noarch.rpm"
RPM_HASH = "22c9c4b669ce2827400929a3a19c300fd59f517b7f6b08093c1bdcfb211f3831c19600d4d3984826a9e4b2b7d4507e489532a0fea6814735860308241674d40c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tikz-lake-fig.sty \
texlive-tikz-lake-fig"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-array.sty \
tex-colortbl.sty \
tex-multirow.sty \
tex-pbox.sty \
tex-relsize.sty \
tex-subfiles.sty \
tex-tabularx.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
