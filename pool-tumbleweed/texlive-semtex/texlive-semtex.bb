SUMMARY = "Deals with stripped SemanTeX documents"
DESCRIPTION = "This package is a small LaTeX package that adds a collection of \
simple macros for parentheses and bullets. It exists for one \
purpose only: To be loaded by documents which were originally \
typeset using the package SemanTeX, but which have been \
stripped of SemanTeX markup using the package stripsemantex \
which is part of SemanTeX. Therefore, unless your document is \
one of those, simply don't use this package. And even if your \
document is one of those, there is a good chance you will not \
have to load it after all. In most cases, you will be able to \
replace the macros it provides by macros from other packages."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.45svn76924"

RPM_NAME = "texlive-semtex-2026.226.0.0.45svn76924-60.2.noarch.rpm"
RPM_HASH = "6fdd349bda1e33ba5ec85673d49a0b51864e6e463cf7f71493a063cb5fdf44a194dcf517ab05d1a6b93a26e12babea127f44b985be51365d66356b5b43b3d087"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-semtex.sty \
texlive-semtex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
