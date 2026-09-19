SUMMARY = "Actuarial symbols of life contingencies and financial mathematics"
DESCRIPTION = "This package provides commands to compose actuarial symbols of \
life contingencies and financial mathematics characterized by \
subscripts and superscripts on both sides of a principal \
symbol. The package also features commands to easily and \
consistently position precedence numbers above or below \
statuses in symbols for multiple lives contracts. Since the \
actuarial notation can get quite involved, the package defines \
a number of shortcut macros to ease entry of the most common \
elements. Appendix A of the package documentation lists the \
commands to typeset a large selection of symbols of life \
contingencies. This package requires actuarialangle."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn67201"

RPM_NAME = "texlive-actuarialsymbol-2026.226.1.1svn67201-61.2.noarch.rpm"
RPM_HASH = "251c27dd32c1f0a3d139decf37c086e9254d066199c3bff56c27aefa74727931cb1cf6bf05bb554715865be00d24b33d3210b86dd4a66a74cf7090663334e48c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-actuarialsymbol.sty \
texlive-actuarialsymbol"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-actuarialangle.sty \
tex-amsmath.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
