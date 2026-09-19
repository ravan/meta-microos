SUMMARY = "Macros for supporting mainly students of FNSPE CTU in Prague"
DESCRIPTION = "This package is primary intended for students of FNSPE CTU in \
Prague but many other students or scientists can found this \
package as useful. This package implements different standards \
of tensor notation, interval notation and complex notation. \
Further many macros and shortcuts are added, e.q. for spaces, \
operators, physics unit, etc."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2asvn45360"

RPM_NAME = "texlive-fnspe-2026.226.1.2asvn45360-60.2.noarch.rpm"
RPM_HASH = "9422e2861177428d96c8efdd430232d2f43186e315dae08ece074286cde27ce981c1fc6e8d098363855bd9668cceff172d1f42d3da3dd92bed48b989aa61fb12"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fnspe.sty \
texlive-fnspe"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsfonts.sty \
tex-amsmath.sty \
tex-amssymb.sty \
tex-amsthm.sty \
tex-bm.sty \
tex-listings.sty \
tex-mathrsfs.sty \
tex-mathtools.sty \
tex-physics.sty \
tex-substr.sty \
tex-tikz.sty \
tex-xcolor.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
