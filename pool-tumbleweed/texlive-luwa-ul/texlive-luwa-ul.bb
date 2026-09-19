SUMMARY = "Provides underlines and other highlighting which can be used in vertical mode"
DESCRIPTION = "This package provides underlining and highlighting that remain \
intact even in vertical writing environments and when used \
together with ruby text. It internally uses lua-ul package, so \
it can be used only under LuaLaTeX."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2.5svn77595"

RPM_NAME = "texlive-luwa-ul-2026.226.1.2.5svn77595-59.2.noarch.rpm"
RPM_HASH = "91438200afd08979764925c484e158aa161dac681f646412898c229de2facb2d72a03c1e2895c5645e900bfd9e6dd4accf880a79dc4b6d8080a6ec3aa063cd3c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-luwa-ul.sty \
texlive-luwa-ul"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-lua-ul.sty \
tex-luacolor.sty \
tex-luatexja-adjust.sty \
tex-tikz.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
