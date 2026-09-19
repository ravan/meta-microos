SUMMARY = "Plot graphs with TikZ abbreviations"
DESCRIPTION = "This is a LaTeX package that provides TikZ-based macros to make \
it easy to draw graphs. The macros provided in this package are \
just abbreviations for TikZ codes, which can be complicated; \
but using the package will hopefully make drawing easier, \
especially when drawing repeatedly. The macros were chosen and \
developed with an emphasis on drawing graphs in economics. The \
package depends on TikZ, xparse, and expl3."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.2svn77181"

RPM_NAME = "texlive-tzplot-2026.226.2.2svn77181-59.2.noarch.rpm"
RPM_HASH = "c72d1679950baf6f0c9cae42abfebd01994aa7e10463175c2872197335a178e81f49cfb9b86e66b021ec1640364b489aa81659b270379ed747f01cb87fff5c70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tzplot.sty \
texlive-tzplot"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
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
