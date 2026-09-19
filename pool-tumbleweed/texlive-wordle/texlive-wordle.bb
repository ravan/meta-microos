SUMMARY = "Create wordle grids"
DESCRIPTION = "This package provides environments (in French or English) to \
display wordle grids: \\begin{WordleGrid} for the English \
version, \\begin{GrilleSutom} for the French version."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3.0svn72059"

RPM_NAME = "texlive-wordle-2026.226.0.0.3.0svn72059-60.2.noarch.rpm"
RPM_HASH = "8e5a126ed6a5b33d534988c1142d96ca005e7ce244fa6a6d9580930d453ce91bae7483701a356e2e28359e09e6a33e31471aeb85f13dd5445e28cac94a9e0ead"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-wordle.sty \
texlive-wordle"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-l3keys2e.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
