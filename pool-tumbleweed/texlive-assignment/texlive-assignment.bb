SUMMARY = "A class file for typesetting homework and lab assignments"
DESCRIPTION = "A class file for typesetting homework and lab assignments."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn20431"

RPM_NAME = "texlive-assignment-2026.226.svn20431-60.2.noarch.rpm"
RPM_HASH = "d7761fb8760cb4946cf119106e33729181cc58bc4bf329a37a24463125b5b78cc43e6efe5c8f805bcb205d2e1d86828d90fb8641fd50d762bd43778b90f903bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-assignment.cls \
texlive-assignment"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
