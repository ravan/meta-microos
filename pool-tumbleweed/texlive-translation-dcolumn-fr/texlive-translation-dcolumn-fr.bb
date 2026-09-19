SUMMARY = "French translation of the documentation of dcolumn"
DESCRIPTION = "A French translation of the documentation of dcolumn."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn24345"

RPM_NAME = "texlive-translation-dcolumn-fr-2026.226.svn24345-59.2.noarch.rpm"
RPM_HASH = "5f5dc779f6965680fdd8d9280f44019ce2bd191c669e0725eac16393af2b98ec425b15ae7dbbef597562663db78c0eb9d264e7a3b03ce3cf89e76f9486c17c83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-translation-dcolumn-fr"

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
