SUMMARY = "A PSTricks package for drawing 2D curves"
DESCRIPTION = "Pst-2dplot is a pstricks package that offers an easy-to-use and \
intuitive tool for plotting 2-d curves. It defines an \
environment with commands similar to MATLAB for plotting."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.5svn15878"

RPM_NAME = "texlive-pst-2dplot-2026.226.1.5svn15878-59.2.noarch.rpm"
RPM_HASH = "2371728317aa1912ce228c2010ca57cffaabb6fc78be75bb6301e68a7a28bb61f55f9ac63bf6f8bb4ca4ecf5b5f606a4c808140304d3f50387584387a232ccf9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-2dplot.sty \
texlive-pst-2dplot"

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
