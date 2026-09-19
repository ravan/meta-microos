SUMMARY = "Typeset (univariate) polynomials"
DESCRIPTION = "The package offers an easy way to write (univariate) \
polynomials and rational functions. It defines two commands, \
one for polynomials \\polynomial{coeffs} and one for rational \
functions \\polynomialfrac{Numerator}{Denominator}. Both \
commands take lists of coefficients as arguments, and offer \
limited optional behaviour."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn15878"

RPM_NAME = "texlive-polynomial-2026.226.1.0svn15878-59.2.noarch.rpm"
RPM_HASH = "1ec59804e13f879a86a322b67189b05d064fe2203786112c821a94cd074b97416b696f69a6b32e8ba214c37eb94f4575ebe3252bbd6c1ad479163760699cb9e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-polynomial.sty \
texlive-polynomial"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-keyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
