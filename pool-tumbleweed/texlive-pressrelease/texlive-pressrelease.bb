SUMMARY = "A class for typesetting press releases"
DESCRIPTION = "A configurable class for writing press releases."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn35147"

RPM_NAME = "texlive-pressrelease-2026.226.1.0svn35147-59.2.noarch.rpm"
RPM_HASH = "5c0dd8443961cd48b0a52b58ca32c09bdd03fe18ab0288f0da2ba7c8cb218b1daca7ff56fc6786033abb5986d98177e35ff5d457990df1efea28fb6f8cd7512c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pressrelease-symbols.sty \
tex-pressrelease.cls \
texlive-pressrelease"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-etoolbox.sty \
tex-geometry.sty \
tex-marvosym.sty \
tex-refcount.sty \
tex-setspace.sty \
tex-tikz.sty \
tex-url.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
