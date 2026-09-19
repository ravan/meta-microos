SUMMARY = "A class to typeset La Gaceta de la RSME"
DESCRIPTION = "The class will typeset papers for <<La Gaceta de la Real \
Sociedad Matematica Espanola>>."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.06svn15878"

RPM_NAME = "texlive-gaceta-2026.226.1.06svn15878-60.2.noarch.rpm"
RPM_HASH = "c66f77bf69497d28857c9b5592ca6efe1ef378c5cd39af3467da1ecf06da9002cd1a72407c310817687e4bdbab8756b7352d38eb32eea627e4613f13178df01c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-gaceta.cls \
texlive-gaceta"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-amssymb.sty \
tex-amsthm.sty \
tex-article.cls \
tex-babel.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-url.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
