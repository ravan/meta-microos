SUMMARY = "A LaTeX course as a projected presentation"
DESCRIPTION = "A brief Beamer-based slide presentation on LaTeX, based on \
Rupprecht's LaTeX 2.09 course, which the author has translated \
to English and taken to LaTeX2e/Beamer. Additional material was \
taken from the Short Introduction to LaTeX."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.2svn68681"

RPM_NAME = "texlive-latex-course-2026.226.2svn68681-63.2.noarch.rpm"
RPM_HASH = "140ef081680cd860422ccf19dff5829dfddfcddb782350985dd60315cd5dd0088289c9a8703daf56943025baf6db60eb8ac252f53732f3d0da1fed769b440f22"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latex-course"

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
