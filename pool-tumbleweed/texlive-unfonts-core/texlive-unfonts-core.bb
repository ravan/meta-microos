SUMMARY = "TrueType version of Un-fonts"
DESCRIPTION = "The Un-fonts come from the HLaTeX as type1 fonts in 1998 by \
Koaunghi Un, he made type1 fonts to use with Korean TeX \
(HLaTeX) in the late 1990's and released it under the GPL \
license. They were converted to TrueType with the FontForge \
(PfaEdit) by Won-kyu Park in 2003. Core families (9 fonts): \
UnBatang, UnBatangBold: serif UnDotum, UnDotumBold: sans-serif \
UnGraphic, UnGraphicBold: sans-serif style UnPilgi, \
UnPilgiBold: script UnGungseo: cursive, brush-stroke"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn56291"

RPM_NAME = "texlive-unfonts-core-2026.226.svn56291-60.2.noarch.rpm"
RPM_HASH = "4baeb5f1cc9c83188d4d94f7752c5a3e433aa071c56cbe4eb7d7736c21cc0e7abba253e93c3dba1f37110e598a528a61bf8debd1d2e88c6038074010b3bb7062"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-unfonts-core"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-unfonts-core-fonts"

inherit rpm
