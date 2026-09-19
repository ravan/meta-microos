SUMMARY = "Enhancement of PostScript math operators to use with PSTricks"
DESCRIPTION = "PostScript lacks a lot of basic operators such as tan, acos, \
asin, cosh, sinh, tanh, acosh, asinh, atanh, exp (with e base). \
Also (oddly) cos and sin use arguments in degrees. Pst-math \
provides all those operators in a header file pst-math.pro with \
wrappers pst-math.sty and pst-math.tex. In addition, sinc, \
gauss, gammaln and bessel are implemented (only partially for \
the latter). The package is designed essentially to work with \
pst-plot but can be used in whatever PS code (such as PSTricks \
SpecialCoor '!', which is useful for placing labels). The \
package also provides a routine SIMPSON for numerical \
integration and a solver of linear equation systems."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.67svn77682"

RPM_NAME = "texlive-pst-math-2026.226.0.0.67svn77682-59.2.noarch.rpm"
RPM_HASH = "122102bca7e9fc36149a2325d7efb10109247f0e8e53e90aeebedd9d25c1569b037d16d202ef833b8ec38522552349146e162a0433cf3ea5a81542bbdf5f6985"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-math.sty \
tex-pst-math.tex \
texlive-pst-math"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifluatex.sty \
tex-multido.sty \
tex-pst-calculate.sty \
tex-pstricks.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
