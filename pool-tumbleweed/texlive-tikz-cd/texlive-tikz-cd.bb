SUMMARY = "Create commutative diagrams with TikZ"
DESCRIPTION = "The general-purpose drawing package TikZ can be used to typeset \
commutative diagrams and other kinds of mathematical pictures, \
generating high-quality results. The purpose of this package is \
to make the process of creation of such diagrams easier by \
providing a convenient set of macros and reasonable default \
settings. This package also includes an arrow tip library that \
match closely the arrows present in the Computer Modern \
typeface."
LICENSE = "LPPL-1.0"

PV = "2026.227.1.0svn77682"

RPM_NAME = "texlive-tikz-cd-2026.227.1.0svn77682-62.2.noarch.rpm"
RPM_HASH = "7925540b382f077f111241a31405ca2bda89084b85df6e1a88f7e928db3e96d7fb495dd1af2bf50f312b24a8b28c81289c0c5f7a67f5b1d78378faf6d3da0c2e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tikz-cd.sty \
tex-tikzlibrarycd.code.tex \
texlive-tikz-cd"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
