SUMMARY = "Print page grid in background"
DESCRIPTION = "This package puts a grid on the paper. It was written for \
developers of a class or package who have to put elements on \
definite locations on a page (e.g. letter class). The grid \
allows a faster optical check, whether the positions are \
correct. If the previewer already offers features for \
measuring, the package might be unnecessary. Otherwise it saves \
the developer from printing the page and measuring by hand. The \
package was part of the oberdiek bundle."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.6svn77682"

RPM_NAME = "texlive-pagegrid-2026.226.1.6svn77682-58.2.noarch.rpm"
RPM_HASH = "d1edcb138d0a69bad72d3dae538ec48927e3387ea4cb1f97f97cee4e8bc6d8b1e8ddcdcb0c45edd05d2e5b921b9bc1659b8a62b3c127ad4d3d5fcfddcdc5ccec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pagegrid.sty \
texlive-pagegrid"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-atbegshi.sty \
tex-kvoptions.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
