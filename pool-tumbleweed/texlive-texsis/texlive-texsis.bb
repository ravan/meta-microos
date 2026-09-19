SUMMARY = "Plain TeX macros for Physicists"
DESCRIPTION = "TeXsis is a TeX macro package which provides useful features \
for typesetting research papers and related documents. For \
example, it includes support specifically for: Automatic \
numbering of equations, figures, tables and references; \
Simplified control of type sizes, line spacing, footnotes, \
running headlines and footlines, and tables of contents, \
figures and tables; Specialized document formats for research \
papers, preprints and 'e-prints', conference proceedings, \
theses, books, referee reports, letters, and memoranda; \
Simplified means of constructing an index for a book or thesis; \
Easy to use double column formatting; Specialized environments \
for lists, theorems and proofs, centered or non-justified text, \
and listing computer code; Specialized macros for easily \
constructing ruled tables. TeXsis was originally developed for \
physicists, but others may also find it useful. It is \
completely compatible with Plain TeX."
LICENSE = "LPPL-1.0"

PV = "2026.227.2.18svn69742"

RPM_NAME = "texlive-texsis-2026.227.2.18svn69742-62.2.noarch.rpm"
RPM_HASH = "ed0906611583807b4b5e8296505091716425bc759b7e03431fd984bf4fb15d41134cb6fb6cd08cc87557bff68ecadc272b06a4a6f52e1413317cc7603bc48a0d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-TXSconts.tex \
tex-TXSdcol.tex \
tex-TXSenvmt.tex \
tex-TXSeqns.tex \
tex-TXSfigs.tex \
tex-TXSfmts.tex \
tex-TXSfonts.tex \
tex-TXShead.tex \
tex-TXSinit.tex \
tex-TXSletr.tex \
tex-TXSmacs.tex \
tex-TXSmemo.tex \
tex-TXSprns.tex \
tex-TXSrefs.tex \
tex-TXSruled.tex \
tex-TXSsects.tex \
tex-TXSsite.tex \
tex-TXSsymb.tex \
tex-TXStags.tex \
tex-TXStitle.tex \
tex-texsis.tex \
texlive-texsis"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-language.dat \
tex-language.dat.lua \
tex-language.def \
texlive \
texlive-cm \
texlive-filesystem \
texlive-hyphen-base \
texlive-knuth-lib \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-pdftex \
texlive-plain \
texlive-scripts \
texlive-scripts-bin \
texlive-tex \
texlive-texsis-bin"

inherit rpm
