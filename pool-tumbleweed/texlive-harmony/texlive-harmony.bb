SUMMARY = "Typeset harmony symbols, etc., for musicology"
DESCRIPTION = "The package harmony.sty uses the packages ifthen and amssymb \
from the amsfonts bundle, together with the LaTeX font \
lcirclew10 and the font musix13 from musixtex."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn72045"

RPM_NAME = "texlive-harmony-2026.226.svn72045-60.4.noarch.rpm"
RPM_HASH = "a89a67ccd1eada98679509c09e86b31e655db1c9d88a0a74a4ea3f1c9e0575a01f78ec0eb356c27eeec4ce19153d26c2a201a41ad9258dd37b42d404d04f68d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-harmony.sty \
texlive-harmony"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amssymb.sty \
tex-ifthen.sty \
tex-mathtools.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
