SUMMARY = "Highlight code and demos with l3regex and lpeg"
DESCRIPTION = "This package uses the l3regex package from the LaTeX3 \
Programming Layer to parse and highlight source code and demos. \
It is more powerful than the listings package, and more easy to \
use than minted. But it is slower than both of them. Therefore \
in LuaTeX the package provides another way to highlight code: \
using LPeg (Parsing Expression Grammars for Lua). LPeg is much \
more powerful and faster than l3regex."
LICENSE = "LPPL-1.0"

PV = "2026.226.2025csvn77682"

RPM_NAME = "texlive-codehigh-2026.226.2025csvn77682-60.2.noarch.rpm"
RPM_HASH = "0d56c992aba2ce19747cc3721caba5a113ffd90a3921cef00cf164d3c2d57a1380a6450324bcc99999984e7d6510825841c394decb841a7502904e7c93fec8bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-codehigh.sty \
texlive-codehigh"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-catchfile.sty \
tex-expl3.sty \
tex-iftex.sty \
tex-luatexbase.sty \
tex-ninecolors.sty \
tex-varwidth.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
