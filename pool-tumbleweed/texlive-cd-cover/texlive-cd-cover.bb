SUMMARY = "Typeset CD covers"
DESCRIPTION = "The CD-cover class will typeset front and back cover sheets for \
CD jewel cases, or an entire paper cover, or a label for a \
plastic slip-cover."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.0svn17121"

RPM_NAME = "texlive-cd-cover-2026.226.1.0svn17121-59.2.noarch.rpm"
RPM_HASH = "12530b4dbeac7138d1e3cd1b8e4c7318efe30808f5bce2b641e5ebdb38d4cc24651a09c7c8cd7c8f0282c0f6628646a72b9f1426ad3a2f284e1f6135113e02cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cd-cover.cls \
texlive-cd-cover"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-rotating.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
