SUMMARY = "Generate truth tables of boolean values in LuaLaTeX"
DESCRIPTION = "This package provides an easy way for generating truth tables \
of boolean values in LuaLaTeX. The time required for operations \
is no issue while compiling with LuaLaTeX. The package supports \
nesting of commands for multiple operations. It can be modified \
or extended by writing custom lua programs. There is no need to \
install lua on users system as TeX distributions (TeX Live or \
MiKTeX) come bundled with LuaLaTeX."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3svn76924"

RPM_NAME = "texlive-luatruthtable-2026.226.1.3svn76924-59.2.noarch.rpm"
RPM_HASH = "44f412699be469f3046f2c699cb92f397b7ffed850febd8bdf2500777022f8e56a12af11f39cc01ba7ebe9a99d271ca1ac44d041272e66dfad28f582c61555ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-luatruthtable.sty \
texlive-luatruthtable"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-luacode.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
