SUMMARY = "Print numbers with separators and exponent if necessary"
DESCRIPTION = "The package numprint prints numbers with a separator every \
three digits and converts numbers given as 12345.6e789 to \
12\\,345,6\\cdot 10^{789}. Numbers are printed in the current \
mode (text or math) in order to use the correct font. Many \
things, including the decimal sign, the thousand separator, as \
well as the product sign can be changed by the user, e.g., to \
reach 12,345.6\\times 10^{789}. If an optional argument is given \
it is printed upright as unit. Numbers can be rounded to a \
given number of digits. The package supports an automatic, \
language-dependent change of the number format. Tabular \
alignment using the tabular(*), array, tabularx, and longtable \
environments (similar to the dcolumn and rccol packages) is \
supported using all features of numprint. Additional text can \
be added before and after the formatted number."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.39svn77682"

RPM_NAME = "texlive-numprint-2026.226.1.39svn77682-61.2.noarch.rpm"
RPM_HASH = "37a11b76b73bfe1a3a9d2704dc4c36516b3567c93045793aa385dd8d4841cb74c23b0b0bd666e3eed126825e8dd3b0ab5dc31ae1fd335e91d13288ab931023ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-nbaseprt.sty \
tex-numprint.sty \
tex-numprint032.sty \
texlive-numprint"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-array.sty \
tex-calc.sty \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
