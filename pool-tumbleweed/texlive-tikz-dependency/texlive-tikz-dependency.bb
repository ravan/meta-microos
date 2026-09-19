SUMMARY = "A library for drawing dependency graphs"
DESCRIPTION = "The package provides a library that draws together existing \
TikZ facilities to make a comfortable environment for drawing \
dependency graphs. Basic facilities of the package include a \
lot of styling facilities, to let you personalize the look and \
feel of the graphs."
LICENSE = "LPPL-1.0"

PV = "2026.227.1.2svn54512"

RPM_NAME = "texlive-tikz-dependency-2026.227.1.2svn54512-62.2.noarch.rpm"
RPM_HASH = "aeb92a2220ea57119052a574b00b7d8d399cab88f4f02abdf49b2b6bfafc052562aade410c51b394d7a3b42ad9ef7019504dceb47cf4db6799b056c690f4bd3f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pgfmanual.code.tex \
tex-pgfmanual.pdflinks.code.tex \
tex-pgfmanual.prettyprinter.code.tex \
tex-tikz-dependency.sty \
texlive-tikz-dependency"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-environ.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
