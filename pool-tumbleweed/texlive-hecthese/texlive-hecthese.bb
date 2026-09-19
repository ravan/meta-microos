SUMMARY = "A class for dissertations and theses at HEC Montreal"
DESCRIPTION = "This package provides the hecthese class, a class based on \
memoir and compatible with LaTeX. Using this class, \
postgraduate students at HEC Montreal will be able to write \
their dissertation or thesis while complying with all the \
presentation standards required by the University. This class \
is meant to be as flexible as possible; in particular, there \
are very few hardcoded features except those that take care of \
the document's layout. Dissertations and theses at HEC Montreal \
can be written on a per-chapter or per-article basis. Documents \
that are written on a per-article basis require a bibliography \
for each of the included articles and a general bibliography \
for the entire document. The hecthese class takes care of these \
requirements. The class depends on babel, color, enumitem, \
fontawesome, framed, numprint, url, and hyperref."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0svn68584"

RPM_NAME = "texlive-hecthese-2026.226.2.0svn68584-60.4.noarch.rpm"
RPM_HASH = "3c4ca0a64e58bcdb3e22bc25fec129782790469b07e5d48b34507c672ecfc9561cf59dbfb44ac50c8a241db579a020e920bc941641ce2ba550641415164323ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hecthese.cls \
texlive-hecthese"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-babel.sty \
tex-calc.sty \
tex-color.sty \
tex-csquotes.sty \
tex-enumitem.sty \
tex-fontenc.sty \
tex-graphicx.sty \
tex-iflang.sty \
tex-ifthen.sty \
tex-inputenc.sty \
tex-memoir.cls \
tex-numprint.sty \
tex-tocvsec2.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
