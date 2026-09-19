SUMMARY = "Extensions and patches for fancyvrb"
DESCRIPTION = "This package provides several extensions to fancyvrb, including \
automatic line breaking and improved math mode. It also patches \
some fancyvrb internals. Parts of fvextra were originally \
developed as part of pythontex and minted."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.14.0svn78167"

RPM_NAME = "texlive-fvextra-2026.226.1.14.0svn78167-60.2.noarch.rpm"
RPM_HASH = "ff1e7169a7077d42d48f5530c8eb578213c680cbb1495ec1c135e1f81f76e8be004d4a10ff73f0c91c55f15e2048fb2a39567491c6dd4e22e85f0e3801ac3413"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fvextra.sty \
texlive-fvextra"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-fancyvrb.sty \
tex-lineno.sty \
tex-textcomp.sty \
tex-upquote.sty \
texlive \
texlive-fancyvrb \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
