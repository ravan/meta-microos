SUMMARY = "Display and manipulate historical non-decimal units"
DESCRIPTION = "Many historical unit systems were non-decimal. For example, the \
Danish rigsdaler -- where 1 rigsdaler consists of 6 mark, each \
again consisting of 16 skilling for a total of 96 skilling per \
rigsdaler -- was used from 1625 to 1875, when currency was \
decimalised to the current system of 1 krone = 100 ore. Units \
for such measures as length, area, weight, and so on were also \
often non-decimal, and in fact remain so in the few places of \
the world that have not made the change to the metric system. \
The non-decimal numbers were chosen due to their larger number \
of division factors, which simplified mental arithmetic, eg. \
when sharing an amount of money or dividing goods. This package \
enables creation and configuration of such units to facilitate \
their presentation in textual and tabular contexts, as well as \
simple arithmetic."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn76924"

RPM_NAME = "texlive-non-decimal-units-2026.226.svn76924-61.2.noarch.rpm"
RPM_HASH = "9402d1bf5855905e68b90fd0639d2130436540c031f0bb15ffc831319a9e8ba3bdf4ba35df01de1803f4f495e8ed43e5d3fe436c3d6d90087c5115ee32d8abfd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-non-decimal-units.british.tex \
tex-non-decimal-units.danish.tex \
tex-non-decimal-units.german.tex \
tex-non-decimal-units.sty \
texlive-non-decimal-units"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
