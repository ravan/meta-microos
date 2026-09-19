SUMMARY = "Implementation of the (new in 2015) XeTeX \\Ucharcat command in lua, for LuaTeX"
DESCRIPTION = "The package implements the \\Ucharcat command for LuaLaTeX. \
\\Ucharcat is a new primitive in XeTeX, an extension of the \
existing \\Uchar command, that allows the specification of the \
catcode as well as character code of the character token being \
constructed."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.03svn38907"

RPM_NAME = "texlive-ucharcat-2026.226.0.0.03svn38907-60.2.noarch.rpm"
RPM_HASH = "1077ceef13ba47d046c1e9b1a49c5dfc38ac4891b7362509a1258d2db00f597e3890d73896eb6dd03b3ba97cc3491448dce8c0f194b39599087111fb3dd9511b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ucharcat.sty \
texlive-ucharcat"

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
