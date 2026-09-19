SUMMARY = "Macros to draw direction fields and solutions of ODEs"
DESCRIPTION = "The package is a small set of macros for drawing direction \
fields, phase portraits and trajectories of differential \
equations and two dimensional autonomous systems. The Euler, \
Runge-Kutta and 4th order Runge-Kutta algorithms are available \
to solve the ODEs. The picture is translated into mfpic macros \
and MetaPost is used to create the final drawing. The package \
is was designed for use with LaTeX, but it can be used in plain \
TeX as well."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.4svn75712"

RPM_NAME = "texlive-mfpic4ode-2026.226.0.0.4svn75712-61.2.noarch.rpm"
RPM_HASH = "4cb7ffab89e738d44ae947bb0e32bea6d7148fe2025424c800d03e8a8fd143b10febf3267bb6a9129b3688cf2a04448027ca0f8ab8af64f9ea27ae51bb578113"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mfpic4ode.sty \
tex-mfpic4ode.tex \
texlive-mfpic4ode"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
