SUMMARY = "LaTeX support for the eiad font"
DESCRIPTION = "The package provides macros to support use of the eiad fonts in \
OT1 encoding. Also offered are a couple of Metafont files \
described in the font package, but not provided there."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn15878"

RPM_NAME = "texlive-eiad-ltx-2026.226.1.0svn15878-61.4.noarch.rpm"
RPM_HASH = "40a08e9d5dd601da206b640d11fbc1b980da723cca1e321e267def20c07b05af866e72ad6c970ec4db6c7f112f86adbf72faf5734ab58c15c92082c99ac10f95"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-eiad.sty \
texlive-eiad-ltx"

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
