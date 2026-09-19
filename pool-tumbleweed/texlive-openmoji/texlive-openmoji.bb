SUMMARY = "Use openmoji through LaTeX commands"
DESCRIPTION = "This package provides commands like twemojis which allow to use \
OpenMoji through LaTeX commands. This relies on images (PDF \
from SVG), so no fancy unicode-font stuff is needed and it \
should work on every installation."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1.1svn77186"

RPM_NAME = "texlive-openmoji-2026.226.0.0.1.1svn77186-61.2.noarch.rpm"
RPM_HASH = "2bc698a8df3c09a538080ca1d36a8ba6c32c794ef57a0c9290dbd6a023bcd37d3d5dfd68c2facad88a34c7432fec7d4cc21e022d9faea1b716253719a1ddc23a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-openmoji.sty \
texlive-openmoji"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-graphicx.sty \
tex-ifthen.sty \
tex-simplekv.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
