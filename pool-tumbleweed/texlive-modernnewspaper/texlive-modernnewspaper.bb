SUMMARY = "A modern, Unicode-first newspaper package for LaTeX"
DESCRIPTION = "modernnewspaper is a Unicode-first LaTeX package for producing \
newspaper-style documents. It supports multi-column layouts, \
multilingual content (including right-to-left scripts), \
Unicode-safe drop caps, column-safe images, and modern metadata \
such as website URLs. The package is designed for XeLaTeX and \
LuaLaTeX and is suitable for both print and digital newspapers."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2.1svn77279"

RPM_NAME = "texlive-modernnewspaper-2026.226.0.0.2.1svn77279-61.2.noarch.rpm"
RPM_HASH = "bda465cc717f1762d09e89a4ba9ad9aceb491d0eca825c5d2ee39ee38a9b131dea8cc05b27f82c342a3bb31bec9333c3d66f102317394ec16d616bae097f91a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-modernnewspaper.sty \
texlive-modernnewspaper"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-bidi.sty \
tex-fontspec.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-iftex.sty \
tex-lettrine.sty \
tex-multicol.sty \
tex-polyglossia.sty \
tex-setspace.sty \
tex-wrapfig.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
