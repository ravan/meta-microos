SUMMARY = "Lua tables made accessible in LaTeX"
DESCRIPTION = "This package provides a LaTeX interface to create, modify, and \
use the Lua data structure >>tables<<. Lua tables can be \
declared with the help of luakeys, and this package provides \
facilities to set, get, check, iterate, apply, etc. to the \
table."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn73999"

RPM_NAME = "texlive-luatbls-2026.226.svn73999-59.2.noarch.rpm"
RPM_HASH = "622a39431892f4aa15eab83c64674f7ea48caa1573b2d94f93b216555620a880046e6c4e555eabd3ef7b640c315ca214eb2c0e0053a9984986e6df1ff48d840a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-luatbls.sty \
texlive-luatbls"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-luacode.sty \
tex-luakeys.sty \
tex-penlightplus.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
