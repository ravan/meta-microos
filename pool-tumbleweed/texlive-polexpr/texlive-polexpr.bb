SUMMARY = "A parser for polynomial expressions"
DESCRIPTION = "The package provides a parser \\poldef of algebraic polynomial \
expressions. As it is based on xintexpr, the coefficients are \
allowed to be arbitrary rational numbers. Once defined, a \
polynomial is usable by its name either as a numerical function \
in \\xintexpr/\\xinteval, or for additional polynomial \
definitions, or as argument to the package macros. The \
localization of real roots to arbitrary precision as well as \
the determination of all rational roots is implemented via such \
macros. Since release 0.8, polexpr extends the xintexpr syntax \
to recognize polynomials as a new variable type (and not only \
as functions). Functionality which previously was implemented \
via macros such as the computation of a greatest common divisor \
is now available directly in \\xintexpr, \\xinteval or \\poldef \
via infix or functional syntax."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.8.7asvn77682"

RPM_NAME = "texlive-polexpr-2026.226.0.0.8.7asvn77682-59.2.noarch.rpm"
RPM_HASH = "0eacfe6fd717d6f1c0a0bfb69c5e8ffca535a76208fae18e5e891bbf3094b7804d08c86da44142ab1c177990a711d00ca39204ee2dad087f082b29a85cfc9408"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-polexpr-examples.tex \
tex-polexpr.sty \
tex-polexprcore.tex \
tex-polexprexpr.tex \
tex-polexprsturm.tex \
texlive-polexpr"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xintexpr.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
