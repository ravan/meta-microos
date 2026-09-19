SUMMARY = "Flexible LaTeX tabulars"
DESCRIPTION = "The package provides an environment, tabu, which will make any \
sort of tabular (that doesn't need to split across pages), and \
an environment longtabu which provides the facilities of tabu \
in a modified longtable environment. (Note that this latter \
offers an enhancement of ltxtable.) The package requires the \
array package, and needs e-TeX to run (since array.sty is \
present in every conforming distribution of LaTeX, and since \
every publicly available LaTeX format is built using e-TeX, the \
requirements are provided by default on any reasonable system). \
The package also requires xcolor for coloured rules in tables, \
and colortbl for coloured cells. The longtabu environment \
further requires that longtable be loaded. The package itself \
does not load any of these packages for the user. The tabu \
environment may be used in place of tabular, tabular* and \
tabularx environments, as well as the array environment in \
maths mode. It overloads tabularx's X-column specification, \
allowing a width specification, alignment (l, r, c and j) and \
column type indication (p, m and b). \\begin{tabu} to <dimen> \
specifies a target width, and \\begin{tabu} spread <dimen> \
enlarges the environment's 'natural' width."
LICENSE = "LPPL-1.0"

PV = "2026.227.2.9svn77682"

RPM_NAME = "texlive-tabu-2026.227.2.9svn77682-62.2.noarch.rpm"
RPM_HASH = "740142e742291178b188c728ef20abf05b8cef2be75a5532e3a11235045ffc07f037c78646b92fb2880422e1366328b22388cb907793e03f4f567c0f8d6f8bbc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tabu.sty \
texlive-tabu"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-array.sty \
tex-delarray.sty \
tex-linegoal.sty \
tex-varwidth.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-varwidth"

inherit rpm
