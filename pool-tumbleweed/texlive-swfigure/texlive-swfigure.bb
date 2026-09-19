SUMMARY = "Insert large images that do not fit into a single page"
DESCRIPTION = "Five different display modes are defined in order to place in a \
document large figures that do not fit into a single page. A \
single user macro is defined to handle all five display modes."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.9.20svn63255"

RPM_NAME = "texlive-swfigure-2026.226.0.0.9.20svn63255-64.2.noarch.rpm"
RPM_HASH = "8d08a60415e2914028ec79430d825daadb2cd2ff1f9580eab9dd4c7d000860e8b69d14bc254c6e2e513cc5ab28141ba1a388c73ed0a0d3255e4c522b9546a40b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-swfigure.sty \
texlive-swfigure"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-afterpage.sty \
tex-etoolbox.sty \
tex-graphicx.sty \
tex-wrapfig.sty \
tex-wrapfig2.sty \
tex-xfp.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
