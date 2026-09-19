SUMMARY = "Multiple versions of a bibliography, with different sort orders"
DESCRIPTION = "This package is a rewrite of the multibibliography package \
providing multiple bibliographies with different sorting. The \
new version offers a number of citation commands, streamlines \
the creation of bibliographies, ensures compatibility with the \
natbib package, and provides other improvements."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.05svn77682"

RPM_NAME = "texlive-nmbib-2026.226.1.05svn77682-61.2.noarch.rpm"
RPM_HASH = "45379d0fe14a50e4d3aee5007c84eb791d3db87adf599a2c70cf3dbbb6616c73572f4d527862022202ff7b6247ee047b8e1783cae12518be0f503cbb29ee51ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-nmbib.sty \
texlive-nmbib"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-natbib.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
