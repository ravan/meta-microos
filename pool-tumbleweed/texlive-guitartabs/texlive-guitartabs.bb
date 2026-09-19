SUMMARY = "A class for drawing guitar tablatures easily"
DESCRIPTION = "This package provides is a simple LaTeX2e class that allows \
guitarists to create basic guitar tablatures using LaTeX. \
Create music and do not be bothered with macro programming. The \
class depends on the LaTeX packages geometry, harmony, \
inputenc, intcalc, musixtex, tikz, and xifthen, as well as the \
article class."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn48102"

RPM_NAME = "texlive-guitartabs-2026.226.svn48102-60.4.noarch.rpm"
RPM_HASH = "921aeaffcf573c88a2eedb65a40d54c877510273b74c67337eb1c6f9ecf2d1f1518c14b1effeb5e6dc0ee6cccca48da9ce5cc715d961bbc81db6518646f8a702"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-guitartabs.cls \
texlive-guitartabs"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-geometry.sty \
tex-harmony.sty \
tex-inputenc.sty \
tex-intcalc.sty \
tex-musixtex.sty \
tex-tikz.sty \
tex-xifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
