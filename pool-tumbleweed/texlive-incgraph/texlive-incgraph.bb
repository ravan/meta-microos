SUMMARY = "Sophisticated graphics inclusion in a PDF document"
DESCRIPTION = "The package provides tools for including graphics at the full \
size of the output medium, or for creating 'pages' whose size \
is that of the graphic they contain. A principal use case is \
documents that require inclusion of (potentially many) scans or \
photographs. Bookmarking is especially supported. The tool box \
has basic macros and a 'convenience' user interface that wraps \
\\includegraphics."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3.0svn76924"

RPM_NAME = "texlive-incgraph-2026.226.1.3.0svn76924-60.2.noarch.rpm"
RPM_HASH = "6791135ace5afc7498e81dd8d94ad8c2c11f898a119549e1d89a307d6b1868cb74b5c4549f4e0159fa797e386db0379f95ea34e3edb6679d52ee7deb4f4a741d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-incgraph.sty \
texlive-incgraph"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-bookmark.sty \
tex-graphicx.sty \
tex-pgf.sty \
tex-pgffor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
