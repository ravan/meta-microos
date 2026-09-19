SUMMARY = "Helper for executing lua code from within TeX"
DESCRIPTION = "Executing Lua code from within TeX with directlua can sometimes \
be tricky: there is no easy way to use the percent character, \
counting backslashes may be hard, and Lua comments don't work \
the way you expect. The package provides the \\luaexec command \
and the luacode(*) environments to help with these problems."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2asvn77682"

RPM_NAME = "texlive-luacode-2026.226.1.2asvn77682-59.2.noarch.rpm"
RPM_HASH = "24a1030c0e398c85bd7f23944a1f554752b39765f543c7238bb062072aa84d956d1d11acf67bd9cb2106d6cfb61b6fd5ab46359ce67ec4c359a8d923afd17256"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-luacode.sty \
texlive-luacode"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifluatex.sty \
tex-luatexbase.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
