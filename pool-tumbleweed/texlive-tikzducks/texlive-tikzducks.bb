SUMMARY = "A little fun package for using rubber ducks in TikZ"
DESCRIPTION = "The package is a LaTeX package for ducks to be used in TikZ \
pictures. This project is a continuation of an answer at \
StackExchange How we can draw a duck?"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.2svn77682"

RPM_NAME = "texlive-tikzducks-2026.226.2.2svn77682-59.2.noarch.rpm"
RPM_HASH = "7e65c0ab26e92e496aa8f81df74d1c1f689ce25212e9972922ef4b1b9cab222643742e307bf72f7c67e3eed42c0589b0a801487bcf25019e5d74786adcf96cd8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tikzducks.sty \
tex-tikzlibraryducks.code.tex \
texlive-tikzducks"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-tikz.sty \
texlive \
texlive-epstopdf-pkg \
texlive-filesystem \
texlive-iftex \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-pgf \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
