SUMMARY = "Use TrueType and OpenType fonts in math mode"
DESCRIPTION = "The mathfont package adapts unicode text fonts for math mode. \
The package allows the user to specify a default unicode font \
for different classes of math symbols, and it enables Unicode \
input in math mode. The package provides tools to change the \
font locally for math alphabet characters. When typesetting \
with LuaTeX, mathfont adds resizable delimiters, big operators, \
and a MathConstants table to text fonts."
LICENSE = "LPPL-1.0"

PV = "2026.226.3.0asvn77682"

RPM_NAME = "texlive-mathfont-2026.226.3.0asvn77682-59.2.noarch.rpm"
RPM_HASH = "48ed481c4c58fd3c946ada5090814337ed4726574c54600372e4579dc87471421cf02804882d9dcfc3d3986ac357b75b919acad33afc4b2f24a2fc987acc2b77"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mathfont.sty \
texlive-mathfont"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fontspec.sty \
tex-luaotfload.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
