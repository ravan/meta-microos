SUMMARY = "A template for ASME journal papers"
DESCRIPTION = "The asmejour class provides a template to format preprints \
submitted to ASME journals. The layout and reference formats \
closely follow the style that is currently being used for \
published papers. The class is intended to be used with the \
asmejour.bst BibTeX style, which is part of this distribution. \
Unlike older ASME LaTeX templates, asmejour pdfs will contain \
hyperlinks, bookmarks, and metadata, and references can include \
the DOI and URL fields. Options include line numbering, final \
column balancing, various math options, government copyright, \
and accessibility (PDF/A). The class is compatible with \
pdfLaTeX or LuaLaTeX. This package is not a publication of \
ASME."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.27svn77682"

RPM_NAME = "texlive-asmejour-2026.226.1.27svn77682-60.2.noarch.rpm"
RPM_HASH = "7615d4a7c2ed02040163d7e9046e974156e8da74a30a8604550dbcbdd5fca03baf13aa5e26685dfd3e016780c6c12377bc6455f8b994dfbe884cf58dde8a9f42"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-asmejour.cls \
texlive-asmejour"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-array.sty \
tex-babel.sty \
tex-bm.sty \
tex-booktabs.sty \
tex-caption.sty \
tex-dcolumn.sty \
tex-doi.sty \
tex-etoolbox.sty \
tex-extarticle.cls \
tex-fancyhdr.sty \
tex-flushend.sty \
tex-fnpos.sty \
tex-fontenc.sty \
tex-footmisc.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-inconsolata.sty \
tex-kvoptions.sty \
tex-lineno.sty \
tex-mathtools.sty \
tex-natbib.sty \
tex-newtxmath.sty \
tex-newtxtext.sty \
tex-unicode-math.sty \
tex-xcolor.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
