SUMMARY = "Work on linear systems using xint or pyluatex"
DESCRIPTION = "This package provides some commands (in French) to perform \
calculations on small (2x2 or 3x3 or 4x4) linear systems, with \
xint or pyluatex: \\DetMatrice or \\DetMatricePY to diplay the \
determinant of a matrix (with formatting options); \
\\MatriceInverse or \\MatriceInversePY to display the invers of a \
matrix (with formatting options) ; \\SolutionSysteme or \
\\SolutionSystemePY to display the solution of a linear system \
(with formatting options); ..."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1.8svn73069"

RPM_NAME = "texlive-resolsysteme-2026.226.0.0.1.8svn73069-60.4.noarch.rpm"
RPM_HASH = "9a310ae0eff2370fa8328168b2287496705bf786214046f9ef0d648c668329a681a70ca2c0a622329c7b69ae34e74b87a07e672fbf29a9318957a44e13203943"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ResolSysteme.sty \
texlive-resolsysteme"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
tex-listofitems.sty \
tex-nicefrac.sty \
tex-nicematrix.sty \
tex-siunitx.sty \
tex-xintexpr.sty \
tex-xinttools.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
