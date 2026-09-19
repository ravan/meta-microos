SUMMARY = "Place text over objects without obscuring background colors"
DESCRIPTION = "This is a PSTricks package which allows to place text over \
objects without obscuring background colors."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn44724"

RPM_NAME = "texlive-pst-rputover-2026.226.1.0svn44724-60.4.noarch.rpm"
RPM_HASH = "82ba7964a7bd39e36414e4749b8e0e17c049eed884c21c47adef8330f0737a8fd3c589380f6a89d9425a4cabce0bd2e4ec598489483a50f148c70c30bed02360"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-rputover.sty \
tex-pst-rputover.tex \
texlive-pst-rputover"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pst-node.sty \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
