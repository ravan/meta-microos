SUMMARY = "Draw Dynkin, Coxeter, and Satake diagrams using TikZ"
DESCRIPTION = "Draws Dynkin, Coxeter, and Satake diagrams in LaTeX documents, \
using the TikZ package. The package requires amsmath, amssymb, \
etoolbox, expl3, mathtools, pgfkeys, pgfopts, TikZ, xparse, and \
xstring."
LICENSE = "LPPL-1.0"

PV = "2026.226.3.141592653589793238462svn76924"

RPM_NAME = "texlive-dynkin-diagrams-2026.226.3.141592653589793238462svn76924-61.4.noarch.rpm"
RPM_HASH = "c42993ddf6660bb80a8b3948e33ed0c17a82d7da78af0ba383aabd381fe57841795182f3b3b48357386dc8ee4c41bc38c345082e00e63a3674ce8d0f4e3c981f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-dynkin-diagrams.sty \
texlive-dynkin-diagrams"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-amssymb.sty \
tex-etoolbox.sty \
tex-mathtools.sty \
tex-pgfkeys.sty \
tex-pgfopts.sty \
tex-tikz.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
