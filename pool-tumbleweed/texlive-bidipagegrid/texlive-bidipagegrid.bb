SUMMARY = "Bidi-aware page grid in background"
DESCRIPTION = "The package is based on pagegrid."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn77682"

RPM_NAME = "texlive-bidipagegrid-2026.226.0.0.2svn77682-61.2.noarch.rpm"
RPM_HASH = "6d6581abc8e28f514054c80d6fe09cc7d3a43a809f47edeec94483cb8f725eed6022fb770a10159d3bf2f60a4aa2db4ce874f03bb637eaf622cb35a4205b8a05"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bidipagegrid.sty \
texlive-bidipagegrid"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-atbegshi.sty \
tex-kvoptions.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
