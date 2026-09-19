SUMMARY = "Special arrows for PSTricks"
DESCRIPTION = "This package has all the code from the package pstricks-add \
which was related to arrows, like multiple arrows and so on."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.05svn61069"

RPM_NAME = "texlive-pst-arrow-2026.226.0.0.05svn61069-59.2.noarch.rpm"
RPM_HASH = "bd68868f9cca78fb46f2348575bab94824fc647f24e8d41dece45280db96dc95b320694eeda4ce031dcf961f5a42b96b4ba218dc46e09008708aadc955785e74"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-arrow.sty \
tex-pst-arrow.tex \
texlive-pst-arrow"

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
