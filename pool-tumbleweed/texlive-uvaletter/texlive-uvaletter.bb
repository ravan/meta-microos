SUMMARY = "Unofficial letterhead template for the University of Amsterdam"
DESCRIPTION = "This is an unofficial LaTeX package that provides a letterhead \
template for the University of Amsterdam. The design mimics the \
official Word template of the University and complies with the \
University's house style."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1.1svn66712"

RPM_NAME = "texlive-uvaletter-2026.226.1.1.1svn66712-60.2.noarch.rpm"
RPM_HASH = "99b5b5600394b27172b69e1615558ce0e271b2632c835bd33103ccef2ab2205f141cb764a466478586ad7a0d71f012c7f52a23c196ba4300393882d14709028d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-uvaletter.sty \
texlive-uvaletter"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fancyhdr.sty \
tex-fontenc.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-ifthen.sty \
tex-inputenc.sty \
tex-lastpage.sty \
tex-microtype.sty \
tex-setspace.sty \
tex-soul.sty \
tex-times.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
