SUMMARY = "Typeset long legal footnotes"
DESCRIPTION = "This package provides formatting for footnotes in long legal \
documents, using hanging indents to make them look nicer."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2.2svn69007"

RPM_NAME = "texlive-coolfn-2026.226.1.2.2svn69007-61.2.noarch.rpm"
RPM_HASH = "61cff8256d4741dece794fcd234c466bfb9dd07dd13505b61f13ab0bf020f69c84e9bbbea4e42eab4ec0f943f368ee734a4aa7ca17546e7eddcc0fb346f7d620"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-coolfn.sty \
texlive-coolfn"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-footmisc.sty \
tex-hanging.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
