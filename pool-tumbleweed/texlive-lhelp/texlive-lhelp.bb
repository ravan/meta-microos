SUMMARY = "Miscellaneous helper packages"
DESCRIPTION = "This package defines macros which are useful for many \
documents. It is a large collection of simple 'little helpers' \
which do not really warrant a separate package on their own. \
Included are, among other things, definitions of common units \
with preceding thinspaces, framed boxes where both width and \
height can be specified, starting new odd or even pages, draft \
markers, notes, conditional includes, including EPS files, and \
versions of enumerate and itemize which allow the horizontal \
and vertical spacing to be changed."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.2.0svn76924"

RPM_NAME = "texlive-lhelp-2026.226.2.0svn76924-61.2.noarch.rpm"
RPM_HASH = "33a7783743ac8e98426f1309921c3b7680feba6bf39cb3009d34ad63dedc5ea5a4e6be6138e436daf1317eb56ea9b275935068b0e91446864c7d99c8f8df4c52"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-lhelp.sty \
texlive-lhelp"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-color.sty \
tex-graphics.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
