SUMMARY = "Augmenting directed graphs"
DESCRIPTION = "This LaTeX package provides the means to easily draw augmenting \
oriented graphs, as well as cuts on them, to demonstrate steps \
of algorithms for solving max-flow min-cut problems. This \
package requires the other LaTeX packages fp, xparse, xstring, \
and TikZ (in particular the TikZ calc library)."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.7.2svn70422"

RPM_NAME = "texlive-adigraph-2026.226.1.7.2svn70422-61.2.noarch.rpm"
RPM_HASH = "ab3f86d3c30b8c1d945db4532e31d4c7ca6bc2b8bb08943cfa1ad976ba603c1ee8a5e6d534f8a3cb2f6cc886fb18785db2914dfbdc1575753686aed459399f3e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-adigraph.sty \
texlive-adigraph"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-fp.sty \
tex-tikz.sty \
tex-xparse.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
