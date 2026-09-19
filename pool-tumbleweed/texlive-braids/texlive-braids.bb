SUMMARY = "Draw braid diagrams with PGF/TikZ"
DESCRIPTION = "The package enables drawing of braid diagrams with PGF/TikZ \
using a simple syntax. The braid itself is specified by giving \
a word in the braid group, and there are many options for \
styling the strands and for drawing 'floors'."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.3svn76924"

RPM_NAME = "texlive-braids-2026.226.2.3svn76924-59.2.noarch.rpm"
RPM_HASH = "335f3f9e3758f29733e4c2ab9e3e708ebeef2528e53b53735845fb4bdf92d4a857916670daa878fac5be47ab398e8de380879f001ad9e27f8ea857ca1e1d1668"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-braids.sty \
tex-tikzlibrarybraids.code.tex \
texlive-braids"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
