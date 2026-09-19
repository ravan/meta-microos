SUMMARY = "Typesetting pretty tables of signs and variations according to French usage"
DESCRIPTION = "This is a complete and easy-to-use package for typesetting \
pretty tables of signs and variations according to French \
usage. The syntax is similar to that of the array environment \
and uses intuitive position commands. Arrows are automatically \
drawn (with PSTricks or TikZ). Macros are provided for drawing \
double bars, single bars crossing zero values, intervals where \
the function is not defined, or for placing special values. \
Many features of variations tables can be customized."
LICENSE = "LPPL-1.0"

PV = "2026.227.2.1svn72007"

RPM_NAME = "texlive-tablvar-2026.227.2.1svn72007-62.2.noarch.rpm"
RPM_HASH = "7e312f0c07c116d99a285ece4dd53ded4663657ba0748923d147505f8e0f6951a7bc7007be4fa22fcc56264b677d6a2e59cc25fcd9b55de433d8802132fe95b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tablvar.sty \
texlive-tablvar"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-array.sty \
tex-iftex.sty \
tex-ifthen.sty \
tex-multido.sty \
tex-pst-node.sty \
tex-tikz.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
