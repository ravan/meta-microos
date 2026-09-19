SUMMARY = "Macros for drawing graphs of graph theory"
DESCRIPTION = "The package provides a collection of useful macros for drawing \
classic graphs of graph theory, or to make other graphs. This \
package has been taken temporarily out of circulation to give \
the author time to investigate some problems."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0svn57485"

RPM_NAME = "texlive-tkz-berge-2026.226.2.0svn57485-59.2.noarch.rpm"
RPM_HASH = "6b057006efaa02cc2d9a80815c1ba5772089128479020201646e5afe981779459453c5d7034876c5ef4578845d7a3e80a08822a08a90300c40af66c2bb798189"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tkz-berge.sty \
texlive-tkz-berge"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-tkz-graph.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
