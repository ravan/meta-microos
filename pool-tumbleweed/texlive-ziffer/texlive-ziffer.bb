SUMMARY = "Conversion of punctuation in maths mode"
DESCRIPTION = "The package modifies the behaviour of characters in maths mode \
so that: '.' is used as a one-thousand separator (as is common \
in Germany) ',' is used as a decimal separator (as is common in \
Germany) '--' is represented with spacing as appropriate to \
such constructs as '1.000,--'. These conversions may be \
switched on and off."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.1svn32279"

RPM_NAME = "texlive-ziffer-2026.226.2.1svn32279-59.4.noarch.rpm"
RPM_HASH = "e3f52918e5165b312ccea3135d553eb3e4be97ff327b73b98edc3ac06876080f657085a648c96fbd2e276c285e858a021dd03f60f49081cebc8a5dd4872c8fc8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ziffer.sty \
texlive-ziffer"

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
