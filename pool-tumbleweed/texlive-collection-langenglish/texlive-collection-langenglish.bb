SUMMARY = "US and UK English"
DESCRIPTION = "Support for, and documentation in, English."
LICENSE = "LPPL-1.0"

PV = "2026.222.svn74022"

RPM_NAME = "texlive-collection-langenglish-2026.222.svn74022-68.2.noarch.rpm"
RPM_HASH = "3c350ac3669c7fc585289e2e9769dd4df201410cd8674bd5a06e5b36a543a3f2d37e303f8352b5289b966355707197aea417d6ab544cd9e46daf98248f26e415"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
tex-english \
texlive-collection-langenglish"

RDEPENDS:${PN} += "texlive-amiweb2c-guide \
texlive-amscls-doc \
texlive-amslatex-primer \
texlive-around-the-bend \
texlive-ascii-chart \
texlive-asy-overview \
texlive-biblatex-cheatsheet \
texlive-collection-basic \
texlive-components \
texlive-comprehensive \
texlive-dickimaw \
texlive-docsurvey \
texlive-drawing-with-metapost \
texlive-dtxtut \
texlive-first-latex-doc \
texlive-fontinstallationguide \
texlive-forest-quickstart \
texlive-gentle \
texlive-guide-to-latex \
texlive-happy4th \
texlive-hyphen-english \
texlive-impatient \
texlive-intro-scientific \
texlive-knuth-errata \
texlive-knuth-hint \
texlive-knuth-pdf \
texlive-l2tabu-english \
texlive-latex-brochure \
texlive-latex-course \
texlive-latex-doc-ptr \
texlive-latex-for-undergraduates \
texlive-latex-graphics-companion \
texlive-latex-refsheet \
texlive-latex-veryshortguide \
texlive-latex-web-companion \
texlive-latex2e-help-texinfo \
texlive-latex4wp \
texlive-latexcheat \
texlive-latexcourse-rug \
texlive-latexfileinfo-pkgs \
texlive-lshort-english \
texlive-macros2e \
texlive-math-into-latex-4 \
texlive-maths-symbols \
texlive-memdesign \
texlive-memoirchapterstyles \
texlive-metafont-beginners \
texlive-metapost-examples \
texlive-patgen2-tutorial \
texlive-pictexsum \
texlive-plain-doc \
texlive-quran-en \
texlive-short-math-guide \
texlive-simplified-latex \
texlive-svg-inkscape \
texlive-tamethebeast \
texlive-tds \
texlive-tex-font-errors-cheatsheet \
texlive-tex-nutshell \
texlive-tex-overview \
texlive-tex-vpat \
texlive-texbytopic \
texlive-texonly \
texlive-titlepages \
texlive-tlc2 \
texlive-tlc3-examples \
texlive-tlmgrbasics \
texlive-typstfun \
texlive-undergradmath \
texlive-visualfaq \
texlive-webguide \
texlive-wrapstuff-doc-en \
texlive-xetexref \
texlive-yet-another-guide-latex2e"

inherit rpm
