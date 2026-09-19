SUMMARY = "Using the OpenType fonts TeX Gyre Termes"
DESCRIPTION = "This package provides the OpenType version of the TeX Gyre \
Termes font, including text and math fonts. The package needs \
LuaLaTeX or XeLaTeX. The missing typefaces like bold math and \
slanted text are also defined."
LICENSE = "LPPL-1.0"

PV = "2026.227.0.0.02svn77682"

RPM_NAME = "texlive-termes-otf-2026.227.0.0.02svn77682-62.2.noarch.rpm"
RPM_HASH = "0f30c5b56e2695f82f44e1dcd83aba93176809dc929495b48e8fba4d9fef6e24898f69873dea49b4b09020f404b3e3806d5ee418e29e0595b9a48244839bb54d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-termes-otf.sty \
texlive-termes-otf"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-iftex.sty \
tex-textcomp.sty \
tex-unicode-math.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
