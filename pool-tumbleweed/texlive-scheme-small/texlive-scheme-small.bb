SUMMARY = "Small scheme (basic + xetex, metapost, a few languages)"
DESCRIPTION = "This is a small TeX Live scheme, corresponding to MacTeX's \
BasicTeX variant. It adds XeTeX, MetaPost, various \
hyphenations, and a few recommended packages to scheme-basic, \
including the tagged pdf support in LaTeX. It also provides the \
{pdf,xe,lua,...}latex-dev engines for helping to test LaTeX."
LICENSE = "LPPL-1.0"

PV = "2026.222.svn77510"

RPM_NAME = "texlive-scheme-small-2026.222.svn77510-68.2.noarch.rpm"
RPM_HASH = "b7c90494e09aa8a55a33bb5572ccd2358e9073b5e48e0d56e95e2d1996e1f8dc8a848b1c1a8490562cae406d8c2f8b1b9f8c247a9de80282963dc0112d181add"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
tex-small \
texlive-scheme-small"

RDEPENDS:${PN} += "texlive-babel-basque \
texlive-babel-czech \
texlive-babel-danish \
texlive-babel-dutch \
texlive-babel-english \
texlive-babel-finnish \
texlive-babel-french \
texlive-babel-german \
texlive-babel-hungarian \
texlive-babel-italian \
texlive-babel-norsk \
texlive-babel-polish \
texlive-babel-portuges \
texlive-babel-spanish \
texlive-babel-swedish \
texlive-collection-basic \
texlive-collection-latex \
texlive-collection-latexrecommended \
texlive-collection-metapost \
texlive-collection-xetex \
texlive-ec \
texlive-epstopdf \
texlive-eurosym \
texlive-hyphen-basque \
texlive-hyphen-czech \
texlive-hyphen-danish \
texlive-hyphen-dutch \
texlive-hyphen-english \
texlive-hyphen-finnish \
texlive-hyphen-french \
texlive-hyphen-german \
texlive-hyphen-hungarian \
texlive-hyphen-italian \
texlive-hyphen-norwegian \
texlive-hyphen-polish \
texlive-hyphen-portuguese \
texlive-hyphen-spanish \
texlive-hyphen-swedish \
texlive-l3backend-dev \
texlive-l3kernel-dev \
texlive-latex-amsmath-dev \
texlive-latex-base-dev \
texlive-latex-bin-dev \
texlive-latex-firstaid-dev \
texlive-latex-graphics-dev \
texlive-latex-lab \
texlive-latex-lab-dev \
texlive-latex-tools-dev \
texlive-lm \
texlive-ltx-talk \
texlive-lua-unicode-math \
texlive-lualibs \
texlive-luamml \
texlive-luaotfload \
texlive-luatexbase \
texlive-make4ht \
texlive-pdfmanagement-testphase \
texlive-revtex \
texlive-synctex \
texlive-tagpdf \
texlive-tex4ebook \
texlive-tex4ht \
texlive-times \
texlive-tipa \
texlive-ulem \
texlive-unicode-math \
texlive-upquote \
texlive-zapfding"

inherit rpm
