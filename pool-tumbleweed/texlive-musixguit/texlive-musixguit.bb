SUMMARY = "Easy notation for guitar music, in MusixTeX"
DESCRIPTION = "The package provides commands for typesetting notes for guitar, \
especially for simplifying guitar notation with MusixTeX."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2.2svn21649"

RPM_NAME = "texlive-musixguit-2026.226.1.2.2svn21649-61.2.noarch.rpm"
RPM_HASH = "49e9cc92c7a088470f86123369a8c16299904482ca5c0dbc18155b0412f4ec442bfd8d416197c23cdac657268c6f71883e5cc15a64ccc0a18335de9288fb2706"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-musixguit.sty \
texlive-musixguit"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-musixgui.tex \
tex-musixper.tex \
tex-musixtex.sty \
tex-setspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
