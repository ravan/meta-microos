SUMMARY = "Make PDF versions of graphics by processing between runs"
DESCRIPTION = "The package pst-pdf simplifies the use of graphics from \
PSTricks and other PostScript code in PDF documents. As in \
building a bibliography with BibTeX, additional external \
programmes are invoked. In this case they are used to create a \
PDF file (\\PDFcontainer) that will contain all the graphics \
material. In the final document these contents will be inserted \
instead of the original PostScript code. The package works with \
pstricks and requires a recent version of the preview package."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2fsvn77682"

RPM_NAME = "texlive-pst-pdf-2026.226.1.2fsvn77682-60.4.noarch.rpm"
RPM_HASH = "cdc943ab6b1c0ce80375938f6cc8d67ff4f592f2333b88f60532358bf148775f0e9e76bb1a63ce9beacf24a9e42600ce39034a8c6ddb22ec7d91a75854d5252a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-pdf.sty \
texlive-pst-pdf"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-environ.sty \
tex-graphicx.sty \
tex-ifpdf.sty \
tex-ifvtex.sty \
tex-ifxetex.sty \
tex-luatex85.sty \
tex-preview.sty \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-pst-pdf-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
