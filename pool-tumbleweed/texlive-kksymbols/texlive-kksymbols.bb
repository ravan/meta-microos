SUMMARY = "LaTeX commands for enclosing characters in circles, squares, diamonds, or brackets"
DESCRIPTION = "This package offers LaTeX commands for enclosing characters in \
circles, squares, diamonds, or brackets, with automatic scaling \
and baseline correction to ensure correct appearance in both \
horizontal and vertical writing modes. The package relies on \
TikZ and works only with LuaLaTeX."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.1.2svn78140"

RPM_NAME = "texlive-kksymbols-2026.226.2.1.2svn78140-63.2.noarch.rpm"
RPM_HASH = "9263653200c28d3ca0e1efb7ab9bb091a403f9a3fa7c72859ca388596968b99270faf388033a8533778dc3919722ceefe35b78177d64ab91ce66ea20475b1568"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-KKsymbols.sty \
texlive-kksymbols"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-kvoptions.sty \
tex-luacode.sty \
tex-luatexja-adjust.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
