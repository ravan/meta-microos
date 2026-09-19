SUMMARY = "An intuitive functional programming interface for LaTeX2"
DESCRIPTION = "This package provides an intuitive functional programming \
interface for LaTeX2, which is an alternative choice to expl3 \
or LuaTeX, if you want to do programming in LaTeX. Although \
there are functions in LaTeX3 programming layer (expl3), the \
evaluation of them is from outside to inside. With this \
package, the evaluation of functions is from inside to outside, \
which is the same as other programming languages such as Lua. \
In this way, it is rather easy to debug code too."
LICENSE = "LPPL-1.0"

PV = "2026.226.2024csvn76924"

RPM_NAME = "texlive-functional-2026.226.2024csvn76924-60.2.noarch.rpm"
RPM_HASH = "528e532039c621774354bbb32e6e50c3aeecd7536926787ae1ac7faf61d5f9ea011b316f0b3799386155b3c201cd114dd8cf7190853d0c0b36571383c1a9f0a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-functional.sty \
texlive-functional"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
