SUMMARY = "Extend the functionality of the calc package"
DESCRIPTION = "This package bundle consists of the following packages: \
bxcalcize: To make calc expressions available in more places. \
bxcalcux: To add user-defined units to the calc syntax. In \
addition, this bundle provides the bxcalc package, which simply \
loads the above-mentioned packages internally."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn56431"

RPM_NAME = "texlive-bxcalc-2026.226.1.1svn56431-59.2.noarch.rpm"
RPM_HASH = "647f3b3705e38c09cda9af5e6245a03a831ede7418aa72563a2c3462083713e7e43d1ca437dfd09e4fe73444f14eac1ca2c7501bbcb65afbd87cea52ed70821f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bxcalc.sty \
tex-bxcalcize.sty \
tex-bxcalcux.sty \
texlive-bxcalc"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-etoolbox.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
