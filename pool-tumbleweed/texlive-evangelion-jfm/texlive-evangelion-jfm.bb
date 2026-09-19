SUMMARY = "A Japanese font metric supporting many advanced features"
DESCRIPTION = "This package provides a Japanese Font Metric supporting \
vertical and horizontal typesetting, 'linegap punctuations', \
'extended fonts', and more interesting and helpful features \
using traditional ('tc') and simplified ('sc') Chinese or \
Japanese fonts under LuaTeX-ja. It also makes full use of the \
'priority' feature, meeting the standards, and allows easy \
customisation."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.5_csvn69751"

RPM_NAME = "texlive-evangelion-jfm-2026.226.1.0.5_csvn69751-59.2.noarch.rpm"
RPM_HASH = "1687b6bf1eaed652c8d4dcfe62b04dacf99c678fcdde5fb1c153008aabbf89f074d4d97dde539e1175c67107314713e8101d85f496bcf6275d5a9ecf34fa32f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-evangelion-jfm"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
