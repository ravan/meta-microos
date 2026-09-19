SUMMARY = "Prettyprinting SuperCollider source code"
DESCRIPTION = "Built on top of the listings package, the package allows \
effortless prettyprinting of SuperCollider source code in \
documents typeset with LaTeX & friends."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn35087"

RPM_NAME = "texlive-sclang-prettifier-2026.226.0.0.1svn35087-60.2.noarch.rpm"
RPM_HASH = "22b52af5f212edd16a69cb01e8f57362feb79c918e8333be6780111877ba0427312ec39c63e4be6f533d8f20628fd48c13777e3daa26e4b139898f5fd3cbfcdf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-sclang-prettifier.sty \
texlive-sclang-prettifier"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-listings.sty \
tex-textcomp.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
