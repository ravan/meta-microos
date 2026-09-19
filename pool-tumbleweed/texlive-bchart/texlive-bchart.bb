SUMMARY = "Draw simple bar charts in LaTeX"
DESCRIPTION = "The package provides horizontal bar charts, drawn using TikZ on \
a numeric X-axis. The focus of the package is simplicity and \
aesthetics."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1.3svn43928"

RPM_NAME = "texlive-bchart-2026.226.0.0.1.3svn43928-61.2.noarch.rpm"
RPM_HASH = "ac52a863bf405058fa833c31aaa3f61e1b04ed17a21a6d75e48f3c63efb327d15c0545d5586198efbc303734d14185ad7d03720fbbfae57b7f0cf497194714dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bchart.sty \
texlive-bchart"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
