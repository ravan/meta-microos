SUMMARY = "Iteration and recurrence relations: finding fixed points, zeros and extrema of functions"
DESCRIPTION = "The package defines commands to iterate functions of a single \
variable, find fixed points, zeros and extrema of such \
functions, and calculate the terms of recurrence relations. \
numerica-plus requires the package numerica, which in turn \
requires l3kernel , l3packages, and the amsmath and mathtools \
packages."
LICENSE = "LPPL-1.0"

PV = "2026.226.3.0.0svn76924"

RPM_NAME = "texlive-numerica-plus-2026.226.3.0.0svn76924-61.2.noarch.rpm"
RPM_HASH = "a63041576fdb7257a41810692462357f024802760237de91052b1933ed46a728310b55effa866ed13bfd4b6f3111865f851b45801956f188abe0cfd1adf0e04d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-numerica-plus.sty \
texlive-numerica-plus"

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
