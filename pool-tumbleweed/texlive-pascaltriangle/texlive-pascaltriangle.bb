SUMMARY = "Draw beautiful Pascal (Yanghui) triangles"
DESCRIPTION = "This LaTeX3 package based on TikZ helps to generate beautiful \
Pascal (Yanghui) triangles. It provides a unique drawing macro \
\\pascal which can generate isosceles or right-angle triangles \
customized by means of different \\pascal macro options or the \
\\pascalset macro."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.1svn76924"

RPM_NAME = "texlive-pascaltriangle-2026.226.1.0.1svn76924-58.2.noarch.rpm"
RPM_HASH = "4d91751230d822d12ad8feeda4de7f33006ffe51f60e3bae56f797688c827e1ac59dba5638e193367fdaaf8649147ef9a382976a9f3587b75603534dfd27e82f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pascaltriangle.sty \
texlive-pascaltriangle"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-etoolbox.sty \
tex-expl3.sty \
tex-tikz.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
