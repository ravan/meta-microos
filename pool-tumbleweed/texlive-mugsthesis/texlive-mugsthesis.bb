SUMMARY = "Thesis class complying with Marquette University Graduate School requirements"
DESCRIPTION = "The bundle offers a thesis class, based on memoir, that \
complies with Marquette University Graduate School \
requirements."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn75301"

RPM_NAME = "texlive-mugsthesis-2026.226.1.1svn75301-61.2.noarch.rpm"
RPM_HASH = "40cb2696cdcef47284081acb5f9193787027272a3d3b8b3c52494e399b069e4a183f860e3954f87f95313e6c30d30fc18b3fd745c5cb721ff37e29b692f6de0d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mugsthesis.cls \
texlive-mugsthesis"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-indentfirst.sty \
tex-memoir.cls \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
