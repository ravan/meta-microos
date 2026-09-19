SUMMARY = "Draw arrows using PGF/TikZ"
DESCRIPTION = "In a document with a lot of diagrams created with PGF/TikZ, \
there is a possibility of the reader being distracted by \
different sorts of arrowheads in the diagrams and in the text \
(as, e.g., in \\rightarrow). The package defines macros to \
create all arrows using PGF/TikZ, so as to avoid the problem."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn25777"

RPM_NAME = "texlive-tikzpfeile-2026.226.1.0svn25777-59.2.noarch.rpm"
RPM_HASH = "95aa34b9d261bb37e831ab475c8f21bd28ed9b5414f30f602cb5b630deb74ed5673e2a88c2c4b6a6a54ecc603bfad8540fed542a99c49c70eeef43a66149206d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tikzpfeile.sty \
texlive-tikzpfeile"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-kvoptions.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
