SUMMARY = "Japanese"
DESCRIPTION = "Support for Japanese; additional packages are in \
collection-langcjk."
LICENSE = "LPPL-1.0"

PV = "2026.222.svn76651"

RPM_NAME = "texlive-collection-langjapanese-2026.222.svn76651-68.2.noarch.rpm"
RPM_HASH = "c038a538ce12cb189e62d2baf96721c97965c3ea2bb60df73d49916064c88e24e3d99183c54f382da183eefae43ce3e6c2dbddb49db2f22fb0e939fad5b51e08"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
tex-japanese \
texlive-collection-langjapanese"

RDEPENDS:${PN} += "texlive-ascmac \
texlive-asternote \
texlive-babel-japanese \
texlive-bxbase \
texlive-bxcjkjatype \
texlive-bxcoloremoji \
texlive-bxghost \
texlive-bxjaholiday \
texlive-bxjalipsum \
texlive-bxjaprnind \
texlive-bxjatoucs \
texlive-bxjscls \
texlive-bxorigcapt \
texlive-bxwareki \
texlive-chuushaku \
texlive-collection-langcjk \
texlive-convbkmk \
texlive-convert-jpfonts \
texlive-endnotesj \
texlive-gckanbun \
texlive-gentombow \
texlive-haranoaji \
texlive-haranoaji-extra \
texlive-ieejtran \
texlive-ifptex \
texlive-ifxptex \
texlive-ipaex \
texlive-japanese-mathformulas \
texlive-japanese-otf \
texlive-jieeetran \
texlive-jlreq \
texlive-jlreq-deluxe \
texlive-jpneduenumerate \
texlive-jpnedumathsymbols \
texlive-jsclasses \
texlive-kanbun \
texlive-lshort-japanese \
texlive-luatexja \
texlive-luwa-ul \
texlive-mendex-doc \
texlive-morisawa \
texlive-outoruby \
texlive-pbibtex-base \
texlive-pbibtex-manual \
texlive-platex \
texlive-platex-tools \
texlive-platexcheat \
texlive-plautopatch \
texlive-ptex \
texlive-ptex-base \
texlive-ptex-fontmaps \
texlive-ptex-fonts \
texlive-ptex-manual \
texlive-ptex2pdf \
texlive-pxbase \
texlive-pxchfon \
texlive-pxcjkcat \
texlive-pxjahyper \
texlive-pxjodel \
texlive-pxrubrica \
texlive-pxufont \
texlive-texlive-ja \
texlive-uplatex \
texlive-uptex \
texlive-uptex-base \
texlive-uptex-fonts \
texlive-wadalab \
texlive-zxjafbfont \
texlive-zxjatype"

inherit rpm
