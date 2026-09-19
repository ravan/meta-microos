SUMMARY = "Miscellaneous mathematical macros"
DESCRIPTION = "The package provides some mathematical macros to typeset: \
mathematical constants e, i, p in upright shape (automatically) \
as recommended by ISO 80000-2, vectors with nice arrows and \
adjusted norm (and tensors), tensors in sans serif bold italic \
shape, some standard operator names, improved spacings in \
mathematical formulas, systems of equations and small matrices, \
displaymath in double columns for lengthy calculations."
LICENSE = "LPPL-1.0"

PV = "2026.226.3.2svn76547"

RPM_NAME = "texlive-mismath-2026.226.3.2svn76547-61.2.noarch.rpm"
RPM_HASH = "ebcf3a2f4a1ceab8fb30c3a298bf736bc9e5938831b90a67fad52acfeb18193de2291042ce51fad45ea53dda4ac11b1d822cbad50c6414a8880a94b9542e17b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mismath.sty \
texlive-mismath"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-decimalcomma.sty \
tex-esvect.sty \
tex-etoolbox.sty \
tex-ibrackets.sty \
tex-iftex.sty \
tex-ifthen.sty \
tex-mathtools.sty \
tex-mleftright.sty \
tex-xkeyval.sty \
tex-xparse.sty \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
