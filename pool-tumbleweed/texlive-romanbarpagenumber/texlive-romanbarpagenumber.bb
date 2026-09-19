SUMMARY = "Typesetting roman page numbers"
DESCRIPTION = "The package romanbar allows to typeset roman numbers with bars. \
This package allows you to use those roman numbers as page \
number."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn36236"

RPM_NAME = "texlive-romanbarpagenumber-2026.226.1.0svn36236-60.2.noarch.rpm"
RPM_HASH = "eb7fcd472e63a21ddb9d940c59b53bec8d0953462a82a949e850b1fcb48febbb08c5bd20883e405bdf56c9058da314f4c84bbf74e8b7bb051d641d8368212a7e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-romanbarpagenumber.sty \
texlive-romanbarpagenumber"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-kvoptions.sty \
tex-romanbar.sty \
tex-xifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
