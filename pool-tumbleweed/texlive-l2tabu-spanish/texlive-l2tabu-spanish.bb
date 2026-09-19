SUMMARY = "Spanish translation of 'Obsolete packages and commands'"
DESCRIPTION = "A Spanish translation of the l2tabu practical guide to LaTeX2e \
by Mark Trettin. A list of obsolete packages, commands and \
usages."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.1.1svn15878"

RPM_NAME = "texlive-l2tabu-spanish-2026.226.1.1svn15878-63.2.noarch.rpm"
RPM_HASH = "b424e9eac5f41256407f02557f2c14c075e8e667ef60a5d41d8fe8ea38b48887ba387d08ce0526aca6a59a3cdf789c04ea58841db7f4ffaa4ebef93a31a2b9c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-l2tabu-spanish"

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
