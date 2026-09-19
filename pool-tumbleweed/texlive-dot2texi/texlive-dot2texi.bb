SUMMARY = "Create graphs within LaTeX using the dot2tex tool"
DESCRIPTION = "The dot2texi package allows you to embed graphs in the DOT \
graph description language in your LaTeX documents. The dot2tex \
tool is used to invoke Graphviz for graph layout, and to \
transform the output from Graphviz to LaTeX code. The generated \
code relies on the TikZ and PGF package or the PSTricks \
package. The process is automated if shell escape is enabled."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.3.0svn26237"

RPM_NAME = "texlive-dot2texi-2026.226.3.0svn26237-59.2.noarch.rpm"
RPM_HASH = "08d736123d25955744cf21a10bbb83394dea61100d1e0a1656752e5446daee25d55d350d4eb174096dd284dc3960bf8bb9ab14afcad53762062ccf76a72f0fa1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-dot2texi.sty \
texlive-dot2texi"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-moreverb.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
