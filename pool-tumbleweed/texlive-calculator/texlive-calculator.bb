SUMMARY = "Use LaTeX as a scientific calculator"
DESCRIPTION = "The calculator and calculus packages define several \
instructions which allow us to realise algebraic operations and \
to evaluate elementary functions and derivatives in our \
documents. The package's main goal is to define the arithmetic \
and functional calculations needed in the author's package \
xpicture, but the numeric abilities of 'calculator' and \
'calculus' may be useful in other contexts."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.1svn77682"

RPM_NAME = "texlive-calculator-2026.226.2.1svn77682-59.2.noarch.rpm"
RPM_HASH = "7c5eadba6d148c37e0283b0f91bc95944f36aaeb04128ef22c13f5dce6e27010144b9ebdd9445063dc2c65ab62db9ec9cfd084046a38b41b9472bad3682e0a1d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-calculator.sty \
tex-calculus.sty \
texlive-calculator"

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
