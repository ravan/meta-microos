SUMMARY = "Babel support for Latin"
DESCRIPTION = "The babel-latin package provides the babel languages latin, \
classicallatin, medievallatin, and ecclesiasticallatin. It also \
defines several useful shorthands as well as some modifiers for \
typographical fine-tuning."
LICENSE = "LPPL-1.0"

PV = "2026.226.4.3svn76176"

RPM_NAME = "texlive-babel-latin-2026.226.4.3svn76176-60.2.noarch.rpm"
RPM_HASH = "fe8db65a83cbc0cc04bbc3369c0ac6d689e2d180b837c7ccfe8f7396c90ef35555597786d0bccafcbdf7e3e93fb42cc83ae517ffb445fc52fbcab61d947a32e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-classicallatin.ldf \
tex-classiclatin.ldf \
tex-ecclesiasticallatin.ldf \
tex-ecclesiasticlatin.ldf \
tex-latin.ldf \
tex-medievallatin.ldf \
texlive-babel-latin"

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
