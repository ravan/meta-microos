SUMMARY = "Include EPS in MetaPost figures"
DESCRIPTION = "The package facilitates including EPS files in MetaPost \
figures; it makes use of (G)AWK."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.0.0.2svn29349"

RPM_NAME = "texlive-epsincl-2026.226.0.0.2svn29349-61.4.noarch.rpm"
RPM_HASH = "dad9269811b0417c62f222319c2b1516e890bddf597991e91e88f611bc4a0a83feb3ff8fac659c8da823a3448917aed8cb4b1351aa1053817d7a48d0d8c9df09"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-epsincl"

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
