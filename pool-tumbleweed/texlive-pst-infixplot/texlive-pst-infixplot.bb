SUMMARY = "Using PSTricks plotting capacities with infix expressions rather than RPN"
DESCRIPTION = "Plotting functions with pst-plot is very powerful but sometimes \
difficult to learn since the syntax of \\psplot and \
\\parametricplot requires some PostScript knowledge. The \
infix-RPN and pst-infixplot styles simplify the usage of \
pst-plot for the beginner, providing macro commands that \
convert natural mathematical expressions to PostScript syntax."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.11svn15878"

RPM_NAME = "texlive-pst-infixplot-2026.226.0.0.11svn15878-59.2.noarch.rpm"
RPM_HASH = "87e78c85bf15b8103b06ad8d79bce4779ed7e9a6bf46f6771579bbe55f11d08f77dea81c291b7ba61eb9a6d866636ab5e975f8b1e03b4f600a002f19e73343a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-infix-RPN.sty \
tex-infix-RPN.tex \
tex-pst-infixplot.sty \
tex-pst-infixplot.tex \
texlive-pst-infixplot"

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
