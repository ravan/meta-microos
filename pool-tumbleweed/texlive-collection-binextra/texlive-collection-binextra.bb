SUMMARY = "TeX auxiliary programs"
DESCRIPTION = "Myriad additional TeX-related support programs. Includes \
programs and macros for DVI file manipulation, literate \
programming, patgen, and plenty more."
LICENSE = "LPPL-1.0"

PV = "2026.222.svn77772"

RPM_NAME = "texlive-collection-binextra-2026.222.svn77772-68.2.noarch.rpm"
RPM_HASH = "8bbfa9ac01ebd279bded33248ad7afbadfa9271c4a770eceb9f1a53f9f86550a306acdae453e8562c8dbb637ca60d7929c8edf2edc4ff92d5e5876ffb993423e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
tex-binextra \
texlive-collection-binextra"

RDEPENDS:${PN} += "texlive-a2ping \
texlive-adhocfilelist \
texlive-arara \
texlive-asymptote \
texlive-bibtex8 \
texlive-bibtexu \
texlive-bundledoc \
texlive-checklistings \
texlive-chklref \
texlive-chktex \
texlive-clojure-pamphlet \
texlive-cluttex \
texlive-collection-basic \
texlive-ctan-chk \
texlive-ctan-o-mat \
texlive-ctanbib \
texlive-ctanify \
texlive-ctanupload \
texlive-ctie \
texlive-cweb \
texlive-de-macro \
texlive-detex \
texlive-digestif \
texlive-dtl \
texlive-dtxgen \
texlive-dviasm \
texlive-dvicopy \
texlive-dvidvi \
texlive-dviinfox \
texlive-dviljk \
texlive-dviout-util \
texlive-dvipng \
texlive-dvipos \
texlive-dvisvgm \
texlive-easydtx \
texlive-expltools \
texlive-findhyph \
texlive-fragmaster \
texlive-git-latexdiff \
texlive-gsftopk \
texlive-hook-pre-commit-pkg \
texlive-ketcindy \
texlive-l3sys-query \
texlive-lacheck \
texlive-latex-git-log \
texlive-latex-papersize \
texlive-latex2man \
texlive-latex2nemeth \
texlive-latexdiff \
texlive-latexfileversion \
texlive-latexindent \
texlive-latexmk \
texlive-latexpand \
texlive-light-latex-make \
texlive-listings-ext \
texlive-ltxfileinfo \
texlive-ltximg \
texlive-make4ht \
texlive-match-parens \
texlive-mflua \
texlive-mkjobtexmf \
texlive-optexcount \
texlive-patgen \
texlive-pdfbook2 \
texlive-pdfcrop \
texlive-pdfjam \
texlive-pdflatexpicscale \
texlive-pdftex-quiet \
texlive-pdftosrc \
texlive-pdfxup \
texlive-pfarrei \
texlive-pkfix \
texlive-pkfix-helper \
texlive-ppmcheckpdf \
texlive-purifyeps \
texlive-pythontex \
texlive-runtexfile \
texlive-runtexshebang \
texlive-scripts-extra \
texlive-seetexk \
texlive-show-pdf-tags \
texlive-spix \
texlive-sqltex \
texlive-srcredact \
texlive-sty2dtx \
texlive-synctex \
texlive-tex4ebook \
texlive-texaccents \
texlive-texblend \
texlive-texcount \
texlive-texdef \
texlive-texdiff \
texlive-texdirflatten \
texlive-texdoc \
texlive-texdoctk \
texlive-texfot \
texlive-texliveonfly \
texlive-texloganalyser \
texlive-texlogfilter \
texlive-texlogsieve \
texlive-texosquery \
texlive-texplate \
texlive-texware \
texlive-tie \
texlive-tpic2pdftex \
texlive-typeoutfileinfo \
texlive-upmendex \
texlive-web \
texlive-xdvipsk \
texlive-xdvipsk-support \
texlive-xindex \
texlive-xpdfopen"

inherit rpm
