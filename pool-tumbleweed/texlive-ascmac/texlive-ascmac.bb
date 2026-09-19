SUMMARY = "Boxes and picture macros with Japanese vertical writing support"
DESCRIPTION = "The bundle provides boxes and picture macros with Japanese \
vertical writing support. It uses only native picture macros \
and fonts for drawing boxes and is thus driver-independent. \
Formerly part of the Japanese pLaTeX bundle, it now supports \
all LaTeX engines."
LICENSE = "BSD-3-Clause"

PV = "2026.226.2.1svn53411"

RPM_NAME = "texlive-ascmac-2026.226.2.1svn53411-60.2.noarch.rpm"
RPM_HASH = "be401fa82964f8eeca0bbb17a2a0268de3a3c5bdbcc2136e41559bfffb1b6b1223f20027a38c697fd4ac43dafbe60d92c3c3a97407d1a811d114633add4b40ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ascgrp.tfm \
tex-ascii10.tfm \
tex-ascii36.tfm \
tex-ascmac.map \
tex-ascmac.sty \
tex-tascmac.sty \
texlive-ascmac"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
texlive \
texlive-ascmac-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
