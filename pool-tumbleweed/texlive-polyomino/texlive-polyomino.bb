SUMMARY = "Polyominoes using TikZ and LaTeX3"
DESCRIPTION = "This package is based on the package TikZ and can be used to \
draw polyominoes. It is possible to define custom styles, pics \
and grids."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0svn76924"

RPM_NAME = "texlive-polyomino-2026.226.2.0svn76924-59.2.noarch.rpm"
RPM_HASH = "ddab500bc6db6ee1706c095fc4a706983233de8cb6131a468ebadbee0f64c1f7a8ab66d8379cd7e3e7e0e08fa0ba54af9752d4744ad19dd2cdaaf89b5574a442"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-polyomino.sty \
texlive-polyomino"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
