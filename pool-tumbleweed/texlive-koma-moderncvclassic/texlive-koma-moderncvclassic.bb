SUMMARY = "Makes the style and command of moderncv (style classic) available for koma-classes and thus compatible with BibLaTeX"
DESCRIPTION = "This package provides an imitation of the moderncv class with \
the classic style (by Xavier Danaux), to be used in conjunction \
with the koma-classes. Thus it is possible to configure \
pagelayout, headings etc. the way it is done in koma-classes. \
Moreover, it is possible to use BibLaTeX, while the original \
moderncv-class is incompatible with BibLaTeX."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.5svn25025"

RPM_NAME = "texlive-koma-moderncvclassic-2026.226.0.0.5svn25025-63.2.noarch.rpm"
RPM_HASH = "8eeb5045e4e833587366d0cfc6f5a9230006b92496d9a09953f2dc0f4a05b2ea5821c324d08db52c873c23eee769ae00cc0f1a2d6e15ca98006cd6160b90f74a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-koma-moderncvclassic.sty \
texlive-koma-moderncvclassic"

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
