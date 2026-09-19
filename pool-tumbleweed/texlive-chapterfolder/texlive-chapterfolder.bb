SUMMARY = "Package for working with complicated folder structures"
DESCRIPTION = "This package simplifies working with folder structures that \
match the chapter/section/subsection structure. It provides \
macros to define a folder that contains the file for a \
chapter/section/subsection, and provides macros that allow \
inclusion without using the full path, rather the path relative \
to the current folder of the chapter/section/subsection. It \
makes easy changing the name of a folder, for example."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0.1svn15878"

RPM_NAME = "texlive-chapterfolder-2026.226.2.0.1svn15878-60.2.noarch.rpm"
RPM_HASH = "da7268c6cd41cdb893f63f32ff9ad41cda0ba71c3302892b1c249d9b910b78595b381c699307dbd0655c0ee1915a5decc92d97dbf39dfe035d1a089020982893"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-chapterfolder.sty \
texlive-chapterfolder"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
