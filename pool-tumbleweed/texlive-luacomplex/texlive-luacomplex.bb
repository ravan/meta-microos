SUMMARY = "Operations on complex numbers inside LaTeX documents using Lua"
DESCRIPTION = "The luacomplex package is developed to define complex numbers \
and perform basic arithmetic on complex numbers in LaTeX. It \
also loads the luamathspackage. It provides an easy way to \
define complex numbers and perform operations on complex \
numbers. There is no particular environment for performing \
operations on complex numbers. The package commands can be used \
in any environment (including the mathematics environment). It \
is written in Lua, and the .tex file is to be compiled with the \
LuaLaTeX engine."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4svn68883"

RPM_NAME = "texlive-luacomplex-2026.226.1.4svn68883-59.2.noarch.rpm"
RPM_HASH = "ed7e701de4bc6402a9603084355850c2fdcfe423efe99a6cf5210fefc8a774a7441125aa1dc8737b98a87e09c8aa6879c723e064210b0c0619abba176fd4c9c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-luacomplex.sty \
texlive-luacomplex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-luacode.sty \
tex-luamaths.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
