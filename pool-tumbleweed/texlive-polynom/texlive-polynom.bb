SUMMARY = "Macros for manipulating polynomials"
DESCRIPTION = "The polynom package implements macros for manipulating \
polynomials, for example it can typeset long polynomial \
divisions. The main test case and application is the polynomial \
ring in one variable with rational coefficients."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.19svn77682"

RPM_NAME = "texlive-polynom-2026.226.0.0.19svn77682-59.2.noarch.rpm"
RPM_HASH = "ee474263134725f3cc2e0ac5ab6366f60552378d9a2ea6a28a6fb64826c17e9fb550a93199a2186da720aedb57b2dedb14237b6ae08c072bd0c4d75190afb321"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-polynom.sty \
texlive-polynom"

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
