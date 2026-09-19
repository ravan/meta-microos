SUMMARY = "A BibLaTeX implementation of the GBT7714-2015 bibliography style for Chinese users"
DESCRIPTION = "This package provides an implementation of the GBT7714-2015 \
bibliography style. This implementation follows the \
GBT7714-2015 standard and can be used by simply loading \
BibLaTeX with the appropriate option. A demonstration database \
is provided to show how to format input for the style."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1vsvn75481"

RPM_NAME = "texlive-biblatex-gb7714-2015-2026.226.1.1vsvn75481-61.2.noarch.rpm"
RPM_HASH = "225a8b0698d7ed115e759f9a3dd247e632568e2a28f16d3f050a926721b32cbffed6b90d696c5bcdf5936cb7e5598e18ed7bd8e6cac41bebffbaf7da6c24c5ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-chinese-cajhss.bbx \
tex-chinese-cajhss.cbx \
tex-chinese-cajhssay.bbx \
tex-chinese-cajhssay.cbx \
tex-chinese-css.bbx \
tex-chinese-css.cbx \
tex-chinese-erj.bbx \
tex-chinese-erj.cbx \
tex-chinese-jmw.bbx \
tex-chinese-jmw.cbx \
tex-chinese-molc.bbx \
tex-chinese-molc.cbx \
tex-gb7714-1987.bbx \
tex-gb7714-1987.cbx \
tex-gb7714-1987ay.bbx \
tex-gb7714-1987ay.cbx \
tex-gb7714-2005.bbx \
tex-gb7714-2005.cbx \
tex-gb7714-2005ay.bbx \
tex-gb7714-2005ay.cbx \
tex-gb7714-2015-gbk.def \
tex-gb7714-2015.bbx \
tex-gb7714-2015.cbx \
tex-gb7714-2015ay.bbx \
tex-gb7714-2015ay.cbx \
tex-gb7714-2015ms.bbx \
tex-gb7714-2015ms.cbx \
tex-gb7714-2015mx.bbx \
tex-gb7714-2015mx.cbx \
tex-gb7714-2025.bbx \
tex-gb7714-2025.cbx \
tex-gb7714-2025ay.bbx \
tex-gb7714-2025ay.cbx \
tex-gb7714-CCNU.bbx \
tex-gb7714-CCNU.cbx \
tex-gb7714-CCNUay.bbx \
tex-gb7714-CCNUay.cbx \
tex-gb7714-NWAFU.bbx \
tex-gb7714-NWAFU.cbx \
tex-gb7714-SEU.bbx \
tex-gb7714-SEU.cbx \
tex-gb7714.bbx \
tex-gb7714.cbx \
tex-gb7714ay.bbx \
tex-gb7714ay.cbx \
texlive-biblatex-gb7714-2015"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-authoryear-comp.cbx \
tex-authoryear.bbx \
tex-mfirstuc.sty \
tex-numeric-comp.bbx \
tex-numeric-comp.cbx \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
