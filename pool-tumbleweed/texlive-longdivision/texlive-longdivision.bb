SUMMARY = "Typesets long division"
DESCRIPTION = "This package executes the long division algorithm and typesets \
the solutions. The dividend must be a positive decimal number \
and the divisor must be a positive integer. Repeating decimals \
is handled correctly, putting a bar over the repeated part of \
the decimal. Dividends up to 20 digits long are handled \
gracefully (though the typeset result will take up about a \
page), and dividends between 20 and 60 digits long slightly \
less gracefully. The package defines two macros, \\longdivision \
and \\intlongdivision. Each takes two arguments, a dividend and \
a divisor. \\longdivision keeps dividing until the remainder is \
zero, or it encounters a repeated remainder. \\intlongdivision \
stops when the dividend stops (though the dividend doesn't have \
to be an integer). This package depends on the xparse package \
from the l3packages bundle."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2.2svn77682"

RPM_NAME = "texlive-longdivision-2026.226.1.2.2svn77682-61.2.noarch.rpm"
RPM_HASH = "15794f67caa64780eb7735cb2e97fdc310153a3ae8b1e0cc5b743d9119412856b2882597550d14a0f2658ecd34c56cd4c50c2e4638df418334eb9f3e1f9f3f2d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-longdivision.sty \
texlive-longdivision"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
