SUMMARY = "Tabbing with accented letters"
DESCRIPTION = "By default, some of the tabbing environment's commands clash \
with default accent commands; LaTeX provides the odd commands \
\\a', etc., to deal with the clash. The package offers a variant \
of the tabbing environment which does not create this \
difficulty, so that users need not learn two sets of accent \
commands."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn59715"

RPM_NAME = "texlive-tabbing-2026.226.svn59715-64.2.noarch.rpm"
RPM_HASH = "2852f85c4757d3e673a51221ac6378ebbc4bd57b41f4219439400d0bfbf36f3b4f108b76599c4e7e9e0e5f0b66dda2076f8c930276037627ffad32cc531410ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-Tabbing.sty \
texlive-tabbing"

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
