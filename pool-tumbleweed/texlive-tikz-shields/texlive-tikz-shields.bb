SUMMARY = "Badges as in shields.io, but in LaTeX"
DESCRIPTION = "A small package that allows to include in a LaTeX document \
shields badges, as in shields.io. Various styles of badges and \
other features are available, including clickable links, logos, \
and color customization options."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.0svn76593"

RPM_NAME = "texlive-tikz-shields-2026.226.1.0svn76593-59.2.noarch.rpm"
RPM_HASH = "27cbd4d25c61c4c87ec3abc4b9e27ce61000cdc8dd3faa55a389385ef8cd2764bdf0e1cc8379807fb1964433e7da7daa9b5dde3681c5cc9bc158625695505291"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tikz-shields.sty \
texlive-tikz-shields"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fontawesome.sty \
tex-fontawesome5.sty \
tex-fontawesome6.sty \
tex-fontawesome7.sty \
tex-hyperref.sty \
tex-ifthen.sty \
tex-tcolorbox.sty \
tex-tikz.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
