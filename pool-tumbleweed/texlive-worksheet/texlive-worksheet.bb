SUMMARY = "Easy creation of worksheets"
DESCRIPTION = "This package provides macros and an environment for easy \
worksheet creation: Use the exercise environment for formatting \
exercises in a simple, efficient design; typeset customized and \
automatically numbered worksheet titles in the same way as \
standard LaTeX titles (using \\maketitle); provide course and \
author information with a scrlayer-scrpage based automated \
header; conforming to different babel languages. (Currently \
English, French, and German are supported.)"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn76924"

RPM_NAME = "texlive-worksheet-2026.226.1.1svn76924-60.2.noarch.rpm"
RPM_HASH = "f9b6d5eb4c1a5d5c587aa5865fb9b46341d00b744068290d544394d119f71c9a4aa428a01f9af93dd5328e39829fcb93a85908f49bce3fd6e38ad696bd7fb2e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-worksheet.sty \
texlive-worksheet"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-scrlayer-scrpage.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
