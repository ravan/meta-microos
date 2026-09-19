SUMMARY = "Class for Springer books"
DESCRIPTION = "This package provides a LaTeX class and templates for books to \
be published at Springer Gabler Research, Springer Vieweg \
Research, Springer Spektrum Research, Springer VS Research, or \
Springer VS Forschung. It may be used to produce monographs in \
different formats and 'several-authors-books' fitting the \
conditions of the aforementioned publishers."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn59333"

RPM_NAME = "texlive-sr-vorl-2026.226.1.2svn59333-64.2.noarch.rpm"
RPM_HASH = "74b85cc8a9daa6f15bf5b899f3c5503c7819e72a35a8373a6c6d8dae16654f8e64d6c7a0d1ec6d0ccc873c1dde9fc8d1265bf0b6a778b6d92470aaf4c0d455f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-sr-vorl.cls \
texlive-sr-vorl"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-babel.sty \
tex-caption.sty \
tex-chngcntr.sty \
tex-enumitem.sty \
tex-etoolbox.sty \
tex-geometry.sty \
tex-mathptmx.sty \
tex-microtype.sty \
tex-onlyamsmath.sty \
tex-ragged2e.sty \
tex-scrlayer-scrpage.sty \
tex-varwidth.sty \
tex-xkeyval.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
