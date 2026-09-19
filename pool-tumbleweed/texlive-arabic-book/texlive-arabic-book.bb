SUMMARY = "An Arabic book class"
DESCRIPTION = "This document class provides both Arabic and English support \
for TeX/LaTeX. Input may be in ASCII transliteration or other \
encodings (including UTF-8), and output may be Arabic, Hebrew, \
or any of several languages that use the Arabic script, as can \
be specified by the polyglossia package. The Arabic font is \
presently available in any Arabic fonts style. In order to use \
Amiri font style, the user needs to install the amiri package. \
This document class runs with the XeTeX engine. PDF files \
generated using this class can be searched, and text can be \
copied from them and pasted elsewhere."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn59594"

RPM_NAME = "texlive-arabic-book-2026.226.1.0svn59594-61.2.noarch.rpm"
RPM_HASH = "43f30f01df3c34390021c8cd2e9729cda3654d81d9861249fcf660d73686a07779c6f742ba63f4f1ac2054385094c66facad9c8acd728ef110defe0fbf0ca61f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-arabic-book.cls \
texlive-arabic-book"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-book.cls \
tex-caption.sty \
tex-collcell.sty \
tex-enumitem.sty \
tex-etoolbox.sty \
tex-float.sty \
tex-geometry.sty \
tex-hyperref.sty \
tex-ifthen.sty \
tex-indentfirst.sty \
tex-newfloat.sty \
tex-polyglossia.sty \
tex-setspace.sty \
tex-tikz.sty \
tex-titlesec.sty \
tex-titling.sty \
tex-tocbibind.sty \
tex-tocloft.sty \
tex-totalcount.sty \
tex-xwatermark.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
