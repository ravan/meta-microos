SUMMARY = "French translation of the documentation of array"
DESCRIPTION = "A French translation of the documentation of array."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn24344"

RPM_NAME = "texlive-translation-array-fr-2026.226.svn24344-59.2.noarch.rpm"
RPM_HASH = "d260e35fe58275cc5a640620311b7127883a6a3511a51e4cb03974be54b0bfb48f27e824f49e154480bc17c50b6a8e18a2aab660f9439c491e3512ef5be6d9d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-translation-array-fr"

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
