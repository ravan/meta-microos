SUMMARY = "Use tablerIcons through LaTeX commands"
DESCRIPTION = "This package provides commands like twemojis which allow to use \
tablerIcons through LaTeX commands. This relies on images (PDF \
from SVG), so no fancy unicode-font stuff is needed and it \
should work on every installation."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1.2svn77184"

RPM_NAME = "texlive-tablericons-2026.226.0.0.1.2svn77184-64.2.noarch.rpm"
RPM_HASH = "646fb240e1558f9d0be80bddc5c48b469dc3431538746e7f67674a6c9871b237ae17c9065fbdeeece2e6607db64b4375a39c391f76244b6a3b3ad3ea031e000a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tablericons.sty \
texlive-tablericons"

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
