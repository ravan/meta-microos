SUMMARY = "Turkish introduction to LaTeX"
DESCRIPTION = "A Turkish translation of Oetiker's (not so) short introduction."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.4.20svn15878"

RPM_NAME = "texlive-lshort-turkish-2026.226.4.20svn15878-59.2.noarch.rpm"
RPM_HASH = "696027864124f812b3187e07345a9853160d8eb4aa863612b6dc52559f3c273fde9a17ac5c2066fef89ae4e345a44a3b3e30fdb168a65d4d63553bc57a3e8929"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lshort-turkish"

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
