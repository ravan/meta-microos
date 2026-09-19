SUMMARY = "Plain (La)TeX packages"
DESCRIPTION = "Add-on packages and macros that work with plain TeX, often \
LaTeX, and occasionally other formats."
LICENSE = "LPPL-1.0"

PV = "2026.222.svn75599"

RPM_NAME = "texlive-collection-plaingeneric-2026.222.svn75599-68.2.noarch.rpm"
RPM_HASH = "0907742ed7a8ab577d266eda2f27944d2f448b4607dac4d45283a5ffe2381ba42dc518b8badd478c1adc4aca6fa021c63dc90460a0b17110fb48152bde4aa3b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
tex-plaingeneric \
texlive-collection-plaingeneric"

RDEPENDS:${PN} += "texlive-abbr \
texlive-abstyles \
texlive-advice \
texlive-apnum \
texlive-autoaligne \
texlive-barr \
texlive-bitelist \
texlive-borceux \
texlive-c-pascal \
texlive-calcfrac \
texlive-catcodes \
texlive-chronosys \
texlive-collargs \
texlive-collection-basic \
texlive-colorsep \
texlive-compare \
texlive-crossrefenum \
texlive-cweb-old \
texlive-dinat \
texlive-dirtree \
texlive-docbytex \
texlive-dowith \
texlive-eijkhout \
texlive-encxvlna \
texlive-eoldef \
texlive-epigram \
texlive-epsf \
texlive-epsf-dvipdfmx \
texlive-etoolbox-generic \
texlive-expex-acro \
texlive-expkv-bundle \
texlive-fenixpar \
texlive-figflow \
texlive-fixpdfmag \
texlive-fltpoint \
texlive-fntproof \
texlive-font-change \
texlive-fontch \
texlive-fontname \
texlive-gates \
texlive-getoptk \
texlive-gfnotation \
texlive-gobble \
texlive-graphics-pln \
texlive-gtl \
texlive-hlist \
texlive-hyplain \
texlive-ifis-macros \
texlive-inputnormalization \
texlive-insbox \
texlive-js-misc \
texlive-kastrup \
texlive-lambda-lists \
texlive-langcode \
texlive-lecturer \
texlive-letterspacing \
texlive-librarian \
texlive-listofitems \
texlive-localloc \
texlive-mathdots \
texlive-measurebox \
texlive-metatex \
texlive-midnight \
texlive-mkpattern \
texlive-mlawriter \
texlive-modulus \
texlive-multido \
texlive-namedef \
texlive-navigator \
texlive-newsletr \
texlive-nth \
texlive-ofs \
texlive-olsak-misc \
texlive-outerhbox \
texlive-path \
texlive-pdf-trans \
texlive-pdfmsym \
texlive-pdftoolbox \
texlive-pitex \
texlive-placeins-plain \
texlive-plain-widow \
texlive-plainpkg \
texlive-plipsum \
texlive-plnfss \
texlive-plstmary \
texlive-poormanlog \
texlive-present \
texlive-pwebmac \
texlive-random \
texlive-randomlist \
texlive-resumemac \
texlive-ruler \
texlive-schemata \
texlive-shade \
texlive-simplekv \
texlive-soul \
texlive-stretchy \
texlive-swrule \
texlive-systeme \
texlive-tabto-generic \
texlive-termmenu \
texlive-tex-ps \
texlive-tex4ht \
texlive-texapi \
texlive-texdate \
texlive-texdimens \
texlive-texinfo \
texlive-timetable \
texlive-tokmap \
texlive-tracklang \
texlive-transparent-io \
texlive-treetex \
texlive-trigonometry \
texlive-tuple \
texlive-ulem \
texlive-upca \
texlive-varisize \
texlive-visualtoks \
texlive-xii \
texlive-xii-lat \
texlive-xintsession \
texlive-xlop \
texlive-yax \
texlive-zztex"

inherit rpm
