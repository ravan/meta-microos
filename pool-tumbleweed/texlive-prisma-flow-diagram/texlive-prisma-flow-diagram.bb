SUMMARY = "An abstraction for creating PRISMA 2009 flow diagrams with TikZ"
DESCRIPTION = "This package provides an abstraction for creating PRISMA 2009 \
flow diagrams in LaTeX. It simplifies the process of building \
these diagrams by providing intuitive commands while \
maintaining full compatibility with TikZ."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.0svn74874"

RPM_NAME = "texlive-prisma-flow-diagram-2026.226.1.0.0svn74874-59.2.noarch.rpm"
RPM_HASH = "72786af0088f03f206c5fa4379b720a5028bc0dbdbea1c39e668fc62675cbf3537073f21a3c5ab8c23436302ec4b8bfb4b1b78b20021dd844fedb59ebcc6393e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-prisma-flow-diagram.sty \
texlive-prisma-flow-diagram"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-float.sty \
tex-graphicx.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
