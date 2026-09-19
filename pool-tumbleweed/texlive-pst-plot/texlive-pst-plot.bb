SUMMARY = "Plot data using PSTricks"
DESCRIPTION = "The package provides plotting of data (typically from external \
files), using PSTricks. Plots may be configured using a wide \
variety of parameters."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.94svn77682"

RPM_NAME = "texlive-pst-plot-2026.226.1.94svn77682-60.4.noarch.rpm"
RPM_HASH = "3b96ab960313411baafd2d0b5eeec243414a548dbcf72104deb9bb1dae568f3c918e03c799594da0c326c62bb874f34db58da737bb3a1cbb06321fae9e6dd43d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-plot.sty \
tex-pst-plot.tex \
tex-pst-plot97.tex \
texlive-pst-plot"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-multido.sty \
tex-pst-xkey.sty \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
