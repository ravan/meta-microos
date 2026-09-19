SUMMARY = "Extended book class"
DESCRIPTION = "The class extends the standard book class, in the areas of \
colour scheme management, document layout, headings and \
footers, front page layout, and other minor items."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn15878"

RPM_NAME = "texlive-bookest-2026.226.1.1svn15878-59.2.noarch.rpm"
RPM_HASH = "7e6e7c97867c0ba675d2c3b19c78685829a5d0237da5e499292400d83e4c27351db07351f7c77ae36d9859bf0f66715f7ef7eb862a1e072a6b8a16d6016081a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bookest.cls \
texlive-bookest"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-book.cls \
tex-color.sty \
tex-eso-pic.sty \
tex-everyshi.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-setspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
