SUMMARY = "Draw pixel pictures"
DESCRIPTION = "With pxpic you draw pictures pixel by pixel. It was inspired by \
a lovely post by Paulo Cereda, among other things (most notably \
a beautiful duck) showcasing the use of characters from the \
Mario video games by Nintendo in LaTeX."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.5svn77682"

RPM_NAME = "texlive-pxpic-2026.226.1.5svn77682-60.4.noarch.rpm"
RPM_HASH = "cc0f599dddf1467b88a6ad14dd1c9973400b9ae9cdc38de836fd57250da7a826117d9a9c346301d7366fbd54f7306f67aed411b1ff174a53a910ebe00ccda0a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pxpic.sty \
texlive-pxpic"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expkv.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
