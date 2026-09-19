SUMMARY = "Typeset 5.5'' x 8'' recipes for browsing or printing"
DESCRIPTION = "This is a LaTeX2e class for typesetting recipes. It is designed \
for typesetting one or two recipes per page, with dimensions of \
5.5'' x 8.5''. The hyperlinked table of contents (ToC) and page \
numbers make browsing recipes convenient, and the pages can be \
joined together or printed two per sheet to normal letterpaper \
easily. The size was chosen to work in half-page 3-ring binder \
cover sheets."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn75878"

RPM_NAME = "texlive-recipebook-2026.226.svn75878-60.4.noarch.rpm"
RPM_HASH = "3c4bb76d925ba31b354ee0d27c7ab5a441f0562ec7afa50af9a1b35a6e9cbd45ccacb00942c3c4a9c172e9a58efcf2c33c06fd7b0cb1fac33e75074d0e080791"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-RecipeBook.cls \
texlive-recipebook"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsfonts.sty \
tex-amsmath.sty \
tex-amssymb.sty \
tex-anyfontsize.sty \
tex-article.cls \
tex-booktabs.sty \
tex-calc.sty \
tex-datetime.sty \
tex-environ.sty \
tex-eso-pic.sty \
tex-fancyhdr.sty \
tex-fontenc.sty \
tex-gensymb.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-multicol.sty \
tex-multirow.sty \
tex-nicefrac.sty \
tex-parskip.sty \
tex-picture.sty \
tex-ragged2e.sty \
tex-scrextend.sty \
tex-tabularx.sty \
tex-tcolorbox.sty \
tex-tgtermes.sty \
tex-tikz.sty \
tex-tocloft.sty \
tex-wrapfig.sty \
tex-xcolor.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
