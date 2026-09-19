SUMMARY = "Persian for LaTeX, using LuaTeX or XeTeX"
DESCRIPTION = "This package provides a convenient interface for typesetting \
Persian and English texts in LaTeX, using the LuaTeX or the \
XeTeX engine. The name 'XePersian' is derived from the words \
experience and persian and captures the author's philosophy of \
writing the package for the best Persian typesetting experience \
in TeX."
LICENSE = "LPPL-1.0"

PV = "2026.226.26.01.01svn77682"

RPM_NAME = "texlive-xepersian-2026.226.26.01.01svn77682-59.4.noarch.rpm"
RPM_HASH = "6120b79fe5c89b86828ca43c6d6b4fe79f601a48474b85a6489f73ba572c70b4f235f3ae960d952ed7347fdd696ee401049b8d7702b52fddaa9429d8aab85a7b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-algorithm-xetex-xepersian.def \
tex-algorithmic-xetex-xepersian.def \
tex-amsart-xetex-xepersian.def \
tex-amsbook-xetex-xepersian.def \
tex-appendix-xetex-xepersian.def \
tex-article-xetex-xepersian.def \
tex-artikel1-xetex-xepersian.def \
tex-artikel2-xetex-xepersian.def \
tex-artikel3-xetex-xepersian.def \
tex-backref-xetex-xepersian.def \
tex-beamer-xetex-xepersian.def \
tex-beamerbasetranslator-xetex-xepersian.def \
tex-bidimoderncv-xetex-xepersian.def \
tex-bidituftesidenote-xetex-xepersian.def \
tex-boek-xetex-xepersian.def \
tex-boek3-xetex-xepersian.def \
tex-book-xetex-xepersian.def \
tex-bookest-xetex-xepersian.def \
tex-breqn-xetex-xepersian.def \
tex-color-localize-xetex-xepersian.def \
tex-enumerate-xetex-xepersian.def \
tex-enumitem-xetex-xepersian.def \
tex-extarticle-xetex-xepersian.def \
tex-extbook-xetex-xepersian.def \
tex-extrafootnotefeatures-xetex-bidi-xetex-xepersian.def \
tex-extreport-xetex-xepersian.def \
tex-fancyref-xetex-xepersian.def \
tex-footnote-xetex-bidi-xetex-xepersian.def \
tex-framed-xetex-xepersian.def \
tex-glossaries-xetex-xepersian.def \
tex-hyperref-xetex-xepersian.def \
tex-imsproc-xetex-xepersian.def \
tex-kashida-xetex-xepersian.def \
tex-latex-localize-commands-xetex-xepersian.def \
tex-latex-localize-environments-xetex-xepersian.def \
tex-latex-localize-messages-xetex-xepersian.def \
tex-latex-localize-misc-xetex-xepersian.def \
tex-listings-xetex-xepersian.def \
tex-localize-xetex-xepersian.def \
tex-memoir-xetex-xepersian.def \
tex-minitoc-xetex-xepersian.def \
tex-natbib-xetex-xepersian.def \
tex-packages-localize-xetex-xepersian.def \
tex-persian-tex-text-nonumbers.map \
tex-persian-tex-text.map \
tex-rapport1-xetex-xepersian.def \
tex-rapport3-xetex-xepersian.def \
tex-refrep-xetex-xepersian.def \
tex-report-xetex-xepersian.def \
tex-scrartcl-xetex-xepersian.def \
tex-scrbook-xetex-xepersian.def \
tex-scrreprt-xetex-xepersian.def \
tex-soul-xetex-xepersian.def \
tex-tkz-linknodes-xetex-xepersian.def \
tex-tocloft-xetex-xepersian.def \
tex-unicode-persiancal.sty \
tex-unicode-persianmath.sty \
tex-url-xetex-xepersian.def \
tex-varioref-xetex-xepersian.def \
tex-xepersian-localize-commands-xetex-xepersian.def \
tex-xepersian-localize-environments-xetex-xepersian.def \
tex-xepersian-magazine.cls \
tex-xepersian-multiplechoice.sty \
tex-xepersian.sty \
texlive-xepersian"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-calc.sty \
tex-datetime.sty \
tex-fancybox.sty \
tex-fancyhdr.sty \
tex-fontspec.sty \
tex-fullpage.sty \
tex-geometry.sty \
tex-hyphenat.sty \
tex-ifthen.sty \
tex-ifxetex.sty \
tex-lastpage.sty \
tex-multicol.sty \
tex-multido.sty \
tex-pifont.sty \
tex-ragged2e.sty \
tex-setspace.sty \
tex-tabularx.sty \
tex-textpos.sty \
tex-verbatim.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
