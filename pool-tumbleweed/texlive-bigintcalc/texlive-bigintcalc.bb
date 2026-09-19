SUMMARY = "Integer calculations on very large numbers"
DESCRIPTION = "This package provides expandable arithmetic operations with big \
integers that can exceed TeX's number limits."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.5svn77682"

RPM_NAME = "texlive-bigintcalc-2026.226.1.5svn77682-61.2.noarch.rpm"
RPM_HASH = "fff2779969483d319c87e88aeee40c4608dd64842cc0e9513d76966678f44ed3a0c4b9d3fae32c8e7c7d1116fc3b6062672c36e0b740ab2af4240c64b61360b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bigintcalc.sty \
texlive-bigintcalc"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pdftexcmds.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
