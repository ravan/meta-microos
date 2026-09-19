SUMMARY = "Computational complexity class names"
DESCRIPTION = "Complexity is a LaTeX package that defines commands to typeset \
Computational Complexity Classes such as $\\P$ and $\\NP$ (as \
well as hundreds of others). It also offers several options \
including which font classes are typeset in and how many are \
defined (all of them or just the basic, most commonly used \
ones). The package has no dependencies other than the standard \
ifthen package."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.81asvn45322"

RPM_NAME = "texlive-complexity-2026.226.0.0.81asvn45322-60.2.noarch.rpm"
RPM_HASH = "850c096f00f86c6d7028c72153110729a3edc91ae7689f52db348398f38dbf4570cfa1e10390c0058dcdf9c584ac903d5bfcf251dceeefd5336f3fd6e1d2a6f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-complexity.sty \
tex-mycomplexity.sty \
texlive-complexity"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
