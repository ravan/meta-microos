SUMMARY = "Simple nodes in four colors written in TikZ for LaTeX"
DESCRIPTION = "This is a LaTeX macro package for generating simple node-based \
flow graphs or diagrams built upon the TikZ package. The \
package provides two basic commands, one to generate a node and \
one to create links between nodes. The positioning of the nodes \
is not handled by the package itself but is preferably done in \
a tabular environment. In total, four simple node types are \
defined, loosely based on the nomenclature and color patterns \
of the popular Java script Bootstrap."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn62888"

RPM_NAME = "texlive-simplenodes-2026.226.svn62888-60.2.noarch.rpm"
RPM_HASH = "380043b685ee5c2b328cad7a10bc2cb0e0b1627eb91cd357c9313853207666c56cbefcaae5571b2f97f7ac85d557013d8a5d876018914563a7717d762befcca4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-simplenodes.sty \
texlive-simplenodes"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-color.sty \
tex-kvoptions.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
