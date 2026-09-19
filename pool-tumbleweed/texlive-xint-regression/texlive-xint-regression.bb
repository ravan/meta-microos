SUMMARY = "Classic regressions, with xint"
DESCRIPTION = "A package for determining classical regressions (linear, \
quadratic, cubic, exponential, etc.) with calculations \
performed by xint. Results (raw or rounded) can be stored in \
customizable macros."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1.3svn77909"

RPM_NAME = "texlive-xint-regression-2026.226.0.0.1.3svn77909-59.4.noarch.rpm"
RPM_HASH = "0f0f777b7b83488a399aa99b63faf8ddaaaa8e7adc92192af017a3d30c61c50578d228e37500d21b45f69ac9bc6c9f7415b3ac0e866f78d44be6e34880248882"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xint-regression.sty \
texlive-xint-regression"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-listofitems.sty \
tex-simplekv.sty \
tex-xintexpr.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
