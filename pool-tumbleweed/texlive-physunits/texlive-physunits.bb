SUMMARY = "Macros for commonly used physical units"
DESCRIPTION = "This package provides a collection of macros to simplify using \
physical units (e.g. m for meters, J for joules, etc.), \
especially in math mode. All major SI units are included, as \
well as some cgs units used in astronomy."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2.0svn58728"

RPM_NAME = "texlive-physunits-2026.226.1.2.0svn58728-58.2.noarch.rpm"
RPM_HASH = "3ce561fd67d2cae654ebe39a9cb36cc626112a937a1647e7199e56a430043a6f9a37a8ae312dd20ae9c3c3460aafd48d90b1050042b4c7142fb2b15d9e1dd983"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-physunits.sty \
texlive-physunits"

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
