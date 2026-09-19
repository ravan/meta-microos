SUMMARY = "Multilingual bibliographies"
DESCRIPTION = "This package enables the user to generate multilingual \
bibliographies in cooperation with babel. Two approaches are \
possible: Each citation may be written in another language, or \
the whole bibliography can be typeset in a language chosen by \
the user. In addition, the package supports commands to change \
the typography of the bibliographies."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.34svn76790"

RPM_NAME = "texlive-babelbib-2026.226.1.34svn76790-60.2.noarch.rpm"
RPM_HASH = "ce51ce8b70252e151727b7f516ce2363ad74842f495d498eb807f907005c0387cfe6a5682a11f30e28a09084383ce13326592202679dc3bda42ae25492c46764"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-babelbib.sty \
texlive-babelbib"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-babel.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
