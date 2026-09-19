SUMMARY = "A non-destructive modulus and integer quotient operator for TeX"
DESCRIPTION = "The package provides an easy way to take the remainder of a \
division operation without destroying the values of the \
counters containing the dividend and divisor. Also provides a \
way to take the integer quotient of a division operation \
without destroying the values of the counters containing the \
dividend and divisor. A tiny but occasionally useful package, \
when doing heavy TeX programming."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn47599"

RPM_NAME = "texlive-modulus-2026.226.1.0svn47599-61.2.noarch.rpm"
RPM_HASH = "6998fd9f5c06a8e76e9731d7823bb8242ece1f57a406d55e13d60a38031fed37a15ef035040a55f73770d3877031bc916ca286ee513dda56ff06a0bd6fa0d935"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-modulus.sty \
texlive-modulus"

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
