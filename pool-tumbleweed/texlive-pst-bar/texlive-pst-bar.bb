SUMMARY = "Produces bar charts using PSTricks"
DESCRIPTION = "The package uses pstricks to draw bar charts from data stored \
in a comma-delimited file. Several types of bar charts may be \
drawn, and the drawing parameters are highly customizable. No \
external packages are required except those that are part of \
the standard PSTricks distribution."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.93svn64331"

RPM_NAME = "texlive-pst-bar-2026.226.0.0.93svn64331-59.2.noarch.rpm"
RPM_HASH = "d60f61aa903900410cc56e0a36e211a941cba3ddea5680322ef0aaa76cd7cab10779bee15a8b366fc4b5ec160d2cced254642d8abae84e8540946b0cddc7f343"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-bar.sty \
tex-pst-bar.tex \
texlive-pst-bar"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
