SUMMARY = "Plotting functions in a simplified way"
DESCRIPTION = "This package is mostly a wrap around pgfplots and Gnuplot, \
hiding most of their inherent complexity."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn77050"

RPM_NAME = "texlive-tikzfxgraph-2026.226.1.1svn77050-59.2.noarch.rpm"
RPM_HASH = "9a665c49d7f7384bbf09eccc8edaf9baccda4df94bcd6c6c731b03f77ee4bb4eead432d5fcf469324a5818ab6da2efe4eb9c8af17832223a7ba739257ba80b77"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tikzfxgraph.sty \
texlive-tikzfxgraph"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pkginfograb.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
