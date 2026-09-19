SUMMARY = "A LaTeX template for ASME conference papers"
DESCRIPTION = "The asmeconf class provides a LaTeX template for ASME \
conference papers, following ASME's guidelines for margins, \
fonts, headings, captions, and reference formats as of 2025. \
This LaTeX template is intended to be used with the \
asmeconf.bst BibTeX style, for reference formatting, which is \
part of this distribution. Unlike older ASME conference LaTeX \
templates, asmeconf pdfs will contain hyperlinks, bookmarks, \
and metadata; and the references can include the DOI and URL \
fields. This LaTeX template enables inline author names, \
following ASME's current style, but it can also produce the \
traditional grid style. Options include line numbering, final \
column balancing, various math options, government copyright, \
archivability and accessibility (PDF/A), and multilingual \
support. The code is compatible with pdfLaTeX or LuaLaTeX. This \
LaTeX template is not a publication of ASME, but it does \
conform to ASME's currently published guidelines for conference \
papers."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.46svn77682"

RPM_NAME = "texlive-asmeconf-2026.226.1.46svn77682-60.2.noarch.rpm"
RPM_HASH = "51a5de486f1ac95748ae7f8cab6305006f8745975fd4e77113ab3a68ad166287827652fc454d4e31a8fa2c040028c5dd9238bc2a4cac9c848d3a84d68841478c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-asmeconf.cls \
texlive-asmeconf"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-array.sty \
tex-article.cls \
tex-babel.sty \
tex-bm.sty \
tex-booktabs.sty \
tex-caption.sty \
tex-dcolumn.sty \
tex-doi.sty \
tex-etoolbox.sty \
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
tex-luatexja-fontspec.sty \
tex-mathtools.sty \
tex-natbib.sty \
tex-newtxmath.sty \
tex-newtxtext.sty \
tex-subcaption.sty \
tex-textcase.sty \
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
