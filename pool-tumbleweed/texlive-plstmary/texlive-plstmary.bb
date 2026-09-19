SUMMARY = "St. Mary's Road font support for plain TeX"
DESCRIPTION = "The package provides commands to produce all the symbols of the \
St Mary's Road fonts, in a Plain TeX environment."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.0.0.5csvn31088"

RPM_NAME = "texlive-plstmary-2026.226.0.0.5csvn31088-59.2.noarch.rpm"
RPM_HASH = "05205ca27e102ea58a1eb3cd1289fe69e9a80a650b726d5049c4d657f4361e7c53f9baf91c50b2b3918e25b99f761d0f5e0c6907887e6aea51b51133f6b6b7b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-stmary.tex \
texlive-plstmary"

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
