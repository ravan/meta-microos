SUMMARY = "Save name of the footnote mark for reuse"
DESCRIPTION = "Sometimes the same footnote applies to more than one location \
in a table. With this package the mark of a footnote can be \
saved into a name, and re-used subsequently without creating \
another footnote at the bottom."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.0svn15878"

RPM_NAME = "texlive-savefnmark-2026.226.1.0svn15878-60.2.noarch.rpm"
RPM_HASH = "82f6128e8339ad69df0bb1e74935e23045fb6ca5750101080551f54d4367aedfdffaf928136c02c9873fc39e5ee4bc2586f1ee4eb75202e02ad9be15dc9224ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-savefnmark.sty \
texlive-savefnmark"

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
