SUMMARY = "Typeset articles for PracTeX"
DESCRIPTION = "The pracjourn class is used for typesetting articles in the \
PracTeX Journal. It is based on the article class with \
modifications to allow for more flexible front-matter and \
revision control, among other small changes."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.0.0.4nsvn61719"

RPM_NAME = "texlive-pracjourn-2026.226.0.0.4nsvn61719-59.2.noarch.rpm"
RPM_HASH = "4a110f47372a23d79fdf02a9cafd1557b4935bc424397d0262bd2dffb10860b20a0c72857739a291449655cc0d5825ac1ef1b9edebf0c58c6d58e16a53cddeae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pracjourn.cls \
texlive-pracjourn"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-color.sty \
tex-fontenc.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-lmodern.sty \
tex-mathpazo.sty \
tex-microtype.sty \
tex-textcomp.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
