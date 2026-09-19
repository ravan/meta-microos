SUMMARY = "Line numbers on paragraphs"
DESCRIPTION = "Adds line numbers to selected paragraphs with reference \
possible through the LaTeX \\ref and \\pageref cross reference \
mechanism. Line numbering may be extended to footnote lines, \
using the fnlineno package."
LICENSE = "LPPL-1.0"

PV = "2026.226.5.7svn77875"

RPM_NAME = "texlive-lineno-2026.226.5.7svn77875-61.2.noarch.rpm"
RPM_HASH = "aa8dc62bfee64ad6e49e4e2d14c318f5b2940dea5025239de3a26adc6a429dfc8144ceba2fe17ceb2f1544805f779595d6ee622ebb98b8976a99254c402723f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ednmath0.sty \
tex-edtable.sty \
tex-fnlineno.sty \
tex-lineno.sty \
tex-vplref.sty \
texlive-lineno"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-finstrut.sty \
tex-kvoptions.sty \
tex-longtable.sty \
tex-ltabptch.sty \
tex-varioref.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
