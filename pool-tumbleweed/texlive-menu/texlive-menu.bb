SUMMARY = "Typesetting menus"
DESCRIPTION = "The package defines command \\menu which assists typesetting of \
a path through a program's menu."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.994svn15878"

RPM_NAME = "texlive-menu-2026.226.0.0.994svn15878-61.2.noarch.rpm"
RPM_HASH = "9dd59d8c0821937d8889a7dd53fee64ba271f74f0412d279a185d3a39f97d53d8b8e058b9ee49c4583fac85c914cb5e9d7a8dc628061debbda6d5b0a677b471d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-menu.sty \
texlive-menu"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-bbding.sty \
tex-color.sty \
tex-fancybox.sty \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
