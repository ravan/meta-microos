SUMMARY = "Typesetting Q&A-style conversation made easier"
DESCRIPTION = "Q-and-A is a LaTeX document class for you to typeset Q&A-style \
conversation. It turns simple pure text Q&A dialog into a \
carefully designed document. Notably, it features two themes, \
ChatGPT-light and ChatGPT-dark, enabling you to format your Q&A \
dialog in a way that closely resembles the interface of \
ChatGPT."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn76924"

RPM_NAME = "texlive-q-and-a-2026.226.svn76924-60.4.noarch.rpm"
RPM_HASH = "136acc355178fff6527069a5f90eea67c0cd2de8696a5b20d6b280a8731baea55ac1aae86e924839977deba63db83686c735d2153634d80f5c070c01fc020fd7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-Q-and-A.cls \
texlive-q-and-a"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ProjLib.sty \
tex-enumitem.sty \
tex-tcolorbox.sty \
texlive \
texlive-einfart \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
