SUMMARY = "Typeset computer listings with LPEG of LuaLaTeX"
DESCRIPTION = "This package uses the Lua library LPEG to typeset and highlight \
computer listings in several languages. It requires the use of \
LuaLaTeX. It won't work with XeLaTeX, nor pdfLaTeX."
LICENSE = "LPPL-1.0"

PV = "2026.226.4.11svn77682"

RPM_NAME = "texlive-piton-2026.226.4.11svn77682-58.2.noarch.rpm"
RPM_HASH = "c26fc12ffc986f74aac99070f54f69fd2bccfd188b4e57e48246424b1857d19e7b5e31dde10d5d0439f55de0d9486546b987981e6a6ca48a0228e62538a7aabc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-piton.sty \
texlive-piton"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amstext.sty \
tex-footnote.sty \
tex-footnotehyper.sty \
tex-luacode.sty \
tex-marginalia.sty \
tex-tcolorbox.sty \
tex-transparent.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
