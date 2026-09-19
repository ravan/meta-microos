SUMMARY = "A LuaLaTeX package for drawing karnaugh maps with up to 6 variables"
DESCRIPTION = "This package, a fork of 2pi's karnaugh-map package, draws \
karnaugh maps with 2, 3, 4, 5, and 6 variables. It also \
contains commands for filling the karnaugh map with terms \
semi-automatically or manually. Last but not least it contains \
commands for drawing implicants on top of the map. The name \
'cartonaugh' is a portmanteau of 'cartographer' and 'karnaugh'. \
The package needs LuaLaTeX and depends on TikZ, xparse, and \
xstring."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn59938"

RPM_NAME = "texlive-cartonaugh-2026.226.1.0svn59938-59.2.noarch.rpm"
RPM_HASH = "2e3ac1f12e0e01f46ea8e89230d88d80bdc0a666bba32c16d31b4a8c8eabd67db70aa9bc3a5ab73bb76fdfda013dd6e1cc21696c8aef7ebe0f756c4500513d81"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cartonaugh.sty \
texlive-cartonaugh"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-iftex.sty \
tex-tikz.sty \
tex-xparse.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
