SUMMARY = "Draw Reo Channels and Circuits"
DESCRIPTION = "The package defines macros and other utilities to design Reo \
Circuits. The package requires PGF/TikZ support."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn34924"

RPM_NAME = "texlive-reotex-2026.226.1.1svn34924-60.4.noarch.rpm"
RPM_HASH = "63490513c4da8781fdcf8b78812cb9b7379463556795e9f89901fea22189968849f9652553ff39546c723381e65f40267990d37196d9b276844523e24ce17b2d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-reotex.sty \
texlive-reotex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
tex-tikz.sty \
tex-verbatim.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
