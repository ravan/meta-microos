SUMMARY = "A linear algebra package for LuaLaTeX"
DESCRIPTION = "The lualinalg package is developed to perform operations on \
vectors and matrices defined over the field of real or complex \
numbers inside LaTeX documents. It provides flexible ways for \
defining and displaying vectors and matrices. No particular \
environment of LaTeX is required to use commands in the \
package. The package is written in Lua, and tex file is to be \
compiled with the LuaLaTeX engine. The time required for \
calculations is not an issue while compiling with LuaLaTeX. \
There is no need to install Lua on the user's system as TeX \
distributions (TeX Live or MiKTeX) come bundled with LuaLaTeX. \
It may also save users' efforts to copy vectors and matrices \
from other software (which may not be in LaTeX-compatible \
format) and to use them in a tex file. The vectors and matrices \
of reasonable size can be handled with ease. The package can be \
modified or extended by writing custom Lua programs."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.9svn76924"

RPM_NAME = "texlive-lualinalg-2026.226.1.9svn76924-59.2.noarch.rpm"
RPM_HASH = "3a23e99febb191b1a1fd158a2ced2be79afa568d6c9019bad247baf2ca1e4f812ceda1fa8f967b2111e4d13aa000edfe1d45cb6dc0048b228b71cc53ca974f55"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-lualinalg.sty \
texlive-lualinalg"

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
