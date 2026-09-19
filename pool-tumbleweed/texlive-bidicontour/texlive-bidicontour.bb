SUMMARY = "Bidi-aware coloured contour around text"
DESCRIPTION = "The package is a re-implementation of the contour package, \
making it bidi-aware, and adding support of the xdvipdfmx (when \
the outline option of the package is used)."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn77682"

RPM_NAME = "texlive-bidicontour-2026.226.0.0.2svn77682-61.2.noarch.rpm"
RPM_HASH = "681ade45b6773f1907bb3ce9c1a48752bdf5041a87db4cd518d8394c0538f8b91e156a282477d6ec363bed9a1a164910bec38aa058031a776ab6efad772250d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bidicontour.sty \
texlive-bidicontour"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-color.sty \
tex-trig.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
