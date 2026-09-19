SUMMARY = "A float environment for photographs"
DESCRIPTION = "This package introduces a new float type called photo which \
works similar to the float types table and figure. Various \
options exist for placing photos, captions, and a \
'photographer' line. In twocolumn documents, a possibility \
exists to generate double-column floats automatically if the \
photo does not fit into one column. Photos do not have to be \
placed as floats, they can also be placed as boxes, with \
captions and photographer line still being available."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn18739"

RPM_NAME = "texlive-photo-2026.226.svn18739-58.2.noarch.rpm"
RPM_HASH = "789064d8dd7fa8e1a494dce58c81054582c7f5db33587e0fd98a2b006dc846410580900376f6ccde8ece61a7b2c4c4a203528778d19a0e8a0b9659f742aa3283"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-photo.sty \
texlive-photo"

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
