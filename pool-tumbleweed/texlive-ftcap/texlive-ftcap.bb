SUMMARY = "Allows \\caption at the beginning of a table-environment"
DESCRIPTION = "For several reasons a \\caption may be desirable at the top of a \
table environment. This package changes the table environment \
such that \\abovecaptionskip and \\belowcaptionskip are swapped. \
The package should also work with a non-standard table \
environment."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.4svn17275"

RPM_NAME = "texlive-ftcap-2026.226.1.4svn17275-60.2.noarch.rpm"
RPM_HASH = "4748a7aa4a84aa50b411999e04f355a2c67cb60566c0e113a563a3b2a7610b83114ff9a7eea2de6185762890a1a1cd4cbb2763d6add6382d5a46fc915f60a10f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ftcap.sty \
texlive-ftcap"

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
