SUMMARY = "Comma for decimal numbers"
DESCRIPTION = "This small package offers a new definition of the comma ',' as \
an active character. It ensures the correct spacing in \
mathematical mode when using the comma either as a decimal \
separator or as a list separator. With this package, the comma \
behaves similarly to ncccomma, but the code is lighter, and \
several compatibility issues have been fixed."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4svn69251"

RPM_NAME = "texlive-decimalcomma-2026.226.1.4svn69251-59.2.noarch.rpm"
RPM_HASH = "ee48dda56ad28e231cf2ca81cd0983e8aaa4bbb27e917bf832dcdd154d37f92708ed2bdd2983c18b169503064a7482998bd6c8959e8685ee574538f768fc549c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-decimalcomma.sty \
texlive-decimalcomma"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-icomma.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
