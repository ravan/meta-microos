SUMMARY = "Extended LaTeX page cross-references with varioref and zref-clever"
DESCRIPTION = "This package offers a compatibility layer for varioref to be \
used alongside zref-clever. It provides \\z... counterparts to \
varioref's main reference commands, each of which essentially \
does some (scoped) setup for varioref, then calls the original \
one."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1.12svn77682"

RPM_NAME = "texlive-zref-vario-2026.226.0.0.1.12svn77682-59.4.noarch.rpm"
RPM_HASH = "b77e73f7b9bbfb51ed458df9b206b97e11ef6e975da253c5ffa770a2c64ca841ec12008454cec74c4ca6e39f2c9f1ff653d0e4cf5170e72466cdd6ea95d5cc7f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-zref-vario.sty \
texlive-zref-vario"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-varioref.sty \
tex-zref-clever.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-tools \
texlive-zref-clever"

inherit rpm
