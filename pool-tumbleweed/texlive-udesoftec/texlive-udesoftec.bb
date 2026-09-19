SUMMARY = "Thesis class for the University of Duisburg-Essen"
DESCRIPTION = "The class is designed for typesetting theses in the Research \
Group for Business Informatics and Software Engineering. (The \
class may also serve as a template for such theses.) The class \
is designed for use with pdfLaTeX; input in UTF-8 encoding is \
assumed."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.7.1svn57866"

RPM_NAME = "texlive-udesoftec-2026.226.1.7.1svn57866-60.2.noarch.rpm"
RPM_HASH = "d8d414fbc87f3a86b52ee05c81b88177b2ffe6aa2356436337bb4e106e16482ce1d1e524716a6f11482b28b3655eda8d6c6c75b43bde99e823561aa78f5746c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-udesoftec-bibcommon.sty \
tex-udesoftec-biblatex.sty \
tex-udesoftec-bst.sty \
tex-udesoftec-extra.sty \
tex-udesoftec.cls \
texlive-udesoftec"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-babel.sty \
tex-chngcntr.sty \
tex-csquotes.sty \
tex-datetime2.sty \
tex-enumitem.sty \
tex-fontenc.sty \
tex-footmisc.sty \
tex-geometry.sty \
tex-glossaries.sty \
tex-graphicx.sty \
tex-hypcap.sty \
tex-hyperref.sty \
tex-hyphenat.sty \
tex-inputenc.sty \
tex-libertine.sty \
tex-listings.sty \
tex-marginnote.sty \
tex-mdframed.sty \
tex-microtype.sty \
tex-multicol.sty \
tex-nag.sty \
tex-natbib.sty \
tex-placeins.sty \
tex-ragged2e.sty \
tex-regexpatch.sty \
tex-scrbook.cls \
tex-scrlayer-scrpage.sty \
tex-tabularx.sty \
tex-tikz.sty \
tex-uri.sty \
tex-wallpaper.sty \
tex-xcolor.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
