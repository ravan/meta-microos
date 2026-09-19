SUMMARY = "LaTeX package for the English raised decimal point"
DESCRIPTION = "This LaTeX package should be used by people who need the \
traditional English raised decimal point, instead of the \
American-style period."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn23374"

RPM_NAME = "texlive-decimal-2026.226.svn23374-59.2.noarch.rpm"
RPM_HASH = "27fb3f944ccf5396c596cda342fe79ad0df65e8ecfa85116f4c90545a72b1e284148e3cce3cff08168bf0d09a60ced5d04a0311d39de3e723db2c4bfac64390d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-decimal.sty \
texlive-decimal"

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
