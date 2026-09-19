SUMMARY = "Drawing optical experimental setups"
DESCRIPTION = "The package is a collection of optical components that \
facilitate easy sketching of optical experimental setups. The \
package uses PSTricks for its output. A wide range of free-ray \
and fibre components is provided, the alignment, positioning \
and labelling of which can be achieved in very simple and \
flexible ways. The components may be connected with fibers or \
beams, and realistic raytraced beam paths are also possible."
LICENSE = "LPPL-1.0"

PV = "2026.226.6.1svn62977"

RPM_NAME = "texlive-pst-optexp-2026.226.6.1svn62977-59.2.noarch.rpm"
RPM_HASH = "6c1140e802ecd9fad80f9897f0e66d952e0472cebac7dd270d43783bc6ae0d4df2cadc66c902d90af72b4a518d265eae9735522b919a0162973c7ba13c00fd37"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-optexp.sty \
texlive-pst-optexp"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-environ.sty \
tex-ifthen.sty \
tex-multido.sty \
tex-pst-eucl.sty \
tex-pst-intersect.sty \
tex-pst-node.sty \
tex-pst-plot.sty \
tex-pst-xkey.sty \
tex-pstricks-add.sty \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
