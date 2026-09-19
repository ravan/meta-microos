SUMMARY = "Coursework template for Tsinghua University"
DESCRIPTION = "A LaTeX package for students of Tsinghua University to write \
coursework more efficiently. It can also be used by students \
from other universities. Note that the package itself does not \
import the ctex package; to use it with Chinese writing, see \
example file ithw.tex for details."
LICENSE = "LPPL-1.0"

PV = "2026.227.2.6svn56435"

RPM_NAME = "texlive-thucoursework-2026.227.2.6svn56435-62.2.noarch.rpm"
RPM_HASH = "94cc3691ffbc62cbf38c69029894ea465792501e807db3405196807136ce371706171f65fe631cc6b4512ee81eb604abbcffe71778946084f27f1fbbdeaa0edd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-iidef.sty \
texlive-thucoursework"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-amsthm.sty \
tex-enumitem.sty \
tex-fancyhdr.sty \
tex-kvoptions.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
