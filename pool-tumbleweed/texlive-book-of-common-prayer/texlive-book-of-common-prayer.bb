SUMMARY = "Typeset in the style of 'Book of Common Prayer'"
DESCRIPTION = "This a package for the typesetting of liturgical documents in \
the style of the 1979 'Book of Common Prayer'. It provides \
macros for common liturgical situations (e.g. versicle and \
response, longer prayers, etc.). This package is designed to \
work with the Sabon font, but it is not necessary to run the \
macros."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1.0svn62240"

RPM_NAME = "texlive-book-of-common-prayer-2026.226.1.1.0svn62240-59.2.noarch.rpm"
RPM_HASH = "c5ceb6eb00742927cd0c27850100b5580028d61d83ce5c2d707155dc8b65b9f69ee76bd25e2f7a21ae19fb4818abe282c4a8f46f0d59559f91b35c6620c15ab0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-book-of-common-prayer.sty \
texlive-book-of-common-prayer"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-alltt.sty \
tex-bilingualpages.sty \
tex-changepage.sty \
tex-enumitem.sty \
tex-fontspec.sty \
tex-framed.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-makecell.sty \
tex-paracol.sty \
tex-pgf.sty \
tex-pgfopts.sty \
tex-pgfornament.sty \
tex-titlesec.sty \
tex-titling.sty \
tex-tocloft.sty \
tex-xcolor.sty \
tex-xtab.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
