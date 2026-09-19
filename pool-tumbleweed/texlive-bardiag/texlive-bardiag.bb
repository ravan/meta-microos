SUMMARY = "LaTeX package for drawing bar diagrams"
DESCRIPTION = "The main purpose of the package is to make the drawing of bar \
diagrams possible and easy in LaTeX. The BarDiag package is \
inspired by and based on PSTricks."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.4asvn22013"

RPM_NAME = "texlive-bardiag-2026.226.0.0.4asvn22013-60.2.noarch.rpm"
RPM_HASH = "085bea7bbdfd102ef37ad0212c5ffb17e473f5cfcc9f22e29ca42bfad18d23d06b3ecb9499e8514ce352887768ae2c542a07f074f74470da258e98ea6ed432f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-barddoc.sty \
tex-bardiag.cfg \
tex-bardiag.sty \
tex-pstfp.sty \
texlive-bardiag"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-fp-snap.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-ifthen.sty \
tex-listings.sty \
tex-makeidx.sty \
tex-multido.sty \
tex-pst-grad.sty \
tex-pstcol.sty \
tex-pstricks.sty \
tex-subfigure.sty \
tex-verbatim.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
