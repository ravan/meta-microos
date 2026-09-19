SUMMARY = "Free form slides with blocks placed on a grid"
DESCRIPTION = "This package allows creating free form slides with blocks \
placed on a grid. The blocks can be filled with text, \
equations, figures etc. The resulting slides are similar to the \
ones produced with LaTeX beamer, but more flexible. Sequential \
unconvering of elements is supported. A compiler script is \
provided which compiles each slide separately, this way \
avoiding long compile times."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1.1svn54512"

RPM_NAME = "texlive-gridslides-2026.226.0.0.1.1svn54512-60.4.noarch.rpm"
RPM_HASH = "f4d43021a4757c63ca67cbc6b0330ccd852ed6d03429b143320710a662f80cdc9327b0030b669f86d0618a2097861d83cc2ab94c34d8ac5037e554e79c3e2f06"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-gridslides.cls \
tex-gridslides.sty \
texlive-gridslides"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-amssymb.sty \
tex-amsthm.sty \
tex-article.cls \
tex-babel.sty \
tex-braket.sty \
tex-dsfont.sty \
tex-enumerate.sty \
tex-environ.sty \
tex-geometry.sty \
tex-hyperref.sty \
tex-inputenc.sty \
tex-mathtools.sty \
tex-microtype.sty \
tex-ragged2e.sty \
tex-siunitx.sty \
tex-tikz.sty \
tex-xspace.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
