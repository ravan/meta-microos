SUMMARY = "Computation of gcd of integers inside LaTeX using Lua"
DESCRIPTION = "Using Lua, the luagcd package is developed to find the greatest \
common divisor (gcd) of integers in LaTeX. The package provides \
commands to obtain step-by-step computation of gcd of two \
integers by using the Euclidean algorithm. In addition, the \
package has the command to express gcd of two integers as a \
linear combination. The Bezout's Identity can be verified for \
any two integers using commands in the package. No particular \
environment is required for the use of commands in the package. \
It is written in Lua, and the TeX file has to be compiled with \
the LuaLaTeX engine."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn76790"

RPM_NAME = "texlive-luagcd-2026.226.1.1svn76790-59.2.noarch.rpm"
RPM_HASH = "efd74974d6ec346e4d298d1ce4e9055960ea2c4178daddcf4447b7bd5b842264c7b347b5b84670ba49e3bc06046a51bf76cb696afd105529b5674bf4c76d78f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-luagcd.sty \
texlive-luagcd"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-luacode.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
