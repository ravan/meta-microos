SUMMARY = "Make an exam paper and its randomized variants"
DESCRIPTION = "This class helps you make an exam paper and its randomized \
variants. It mainly focuses on making math exam papers, but you \
could use it to make other exam papers."
LICENSE = "LPPL-1.0"

PV = "2026.226.2024fsvn71883"

RPM_NAME = "texlive-randexam-2026.226.2024fsvn71883-60.4.noarch.rpm"
RPM_HASH = "bd27ebd32e68f42ec453b0ca2cfc314bb14eba98eca2ad2031dea8d1a531abc299db508faf35b7b554695d0b442b4650e4e7b11837a1a3f3cb353793f974c73f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-randexam.cls \
texlive-randexam"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-CJKfntef.sty \
tex-CJKnumb.sty \
tex-amsmath.sty \
tex-amssymb.sty \
tex-array.sty \
tex-article.cls \
tex-calc.sty \
tex-comment.sty \
tex-ctex.sty \
tex-enumitem.sty \
tex-environ.sty \
tex-etoolbox.sty \
tex-extarrows.sty \
tex-fancyhdr.sty \
tex-freealign.sty \
tex-functional.sty \
tex-geometry.sty \
tex-iftex.sty \
tex-mathdesign.sty \
tex-mathtools.sty \
tex-medmath.sty \
tex-pdfpages.sty \
tex-pgf.sty \
tex-pgffor.sty \
tex-tabularray.sty \
tex-tabularx.sty \
tex-xcolor.sty \
tex-xeCJK.sty \
tex-xeCJKfntef.sty \
tex-zref-lastpage.sty \
tex-zref-user.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
