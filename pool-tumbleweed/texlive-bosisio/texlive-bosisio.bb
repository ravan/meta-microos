SUMMARY = "A collection of packages by Francesco Bosisio"
DESCRIPTION = "A collection of packages containing: accenti dblfont; envmath; \
evenpage; graphfig; mathcmd; quotes; and sobolev."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn16989"

RPM_NAME = "texlive-bosisio-2026.226.svn16989-59.2.noarch.rpm"
RPM_HASH = "11db13eadf4bbfdfbaec4559572c8fc0afced3b421cfbb88f036f0bb186f6e4be18c168872bcace06b3a3a2af4b9620d0dfd613bb0002b2b0d4d3c6a15af0b2d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-accenti.sty \
tex-dblfont.sty \
tex-envmath.sty \
tex-evenpage.sty \
tex-graphfig.sty \
tex-mathcmd.sty \
tex-quotes.sty \
tex-sobolev.sty \
texlive-bosisio"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-float.sty \
tex-graphics.sty \
tex-subfigure.sty \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
