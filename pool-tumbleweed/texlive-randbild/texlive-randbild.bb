SUMMARY = "Marginal pictures"
DESCRIPTION = "Provides environments randbild to draw small marginal plots \
(using the packages pstricks and pst-plot), and randbildbasis \
(the same, only without the automatically drawn coordinate \
system)."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn15878"

RPM_NAME = "texlive-randbild-2026.226.0.0.2svn15878-60.4.noarch.rpm"
RPM_HASH = "4b24e2005e196d862919ea1dc87661373d9871e62ab7b161a5aa5772e537117fa4b5cb5e9be11c22ac944e8b691036202ea9dabdd3f0f1dcc1695477541ebfeb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-randbild.sty \
texlive-randbild"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pst-plot.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
