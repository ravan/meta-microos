SUMMARY = "A variation on the tabular environment"
DESCRIPTION = "The package offers a modification of the tabular environment, \
which deals with the problem of column heads that are \
significantly wider than the body of the column."
LICENSE = "LPPL-1.0"

PV = "2026.227.0.0.1svn15878"

RPM_NAME = "texlive-tabularew-2026.227.0.0.1svn15878-62.2.noarch.rpm"
RPM_HASH = "dd4313751567836e30c8563c9befd50a49fc3c4832dfbad3555c6e4928218155040062e6250e508a12d113a6a6abb8ffd1d9e3c6bd7462c03178d8798f3f3176"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tabularew.sty \
texlive-tabularew"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-array.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
