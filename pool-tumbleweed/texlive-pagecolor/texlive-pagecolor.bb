SUMMARY = "Interrogate page color"
DESCRIPTION = "This package provides the command \\thepagecolor, which gives \
the current page (background) color, i. e. the argument used \
with the most recent call of \\pagecolor{...}. The command \
\\thepagecolornone gives the same color as \\thepagecolor, except \
when the page background color is 'none' (e.g., as a result of \
using the \\nopagecolor command). In that case \\thepagecolor is \
'white' and \\thepagecolornone is 'none'. When \\nopagecolor is \
unknown or broken (crop package), this package provides a \
replacement. Similar to \\newgeometry and \\restoregeometry of \
the geometry package \\newpagecolor{...} and \\restorepagecolor \
are provided. For use with the crop package \
\\backgroundpagecolor{...} as well as \
\\newbackgroundpagecolor{...} and \\restorebackgroundpagecolor \
are provided."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2dsvn77682"

RPM_NAME = "texlive-pagecolor-2026.226.1.2dsvn77682-58.2.noarch.rpm"
RPM_HASH = "cedfb4121728bd4f24673403f7ed1ebf30ce543df4437ca46f63a9500301f0355e2b32457a137d351d04ea0b92ae2d619605b0d8954b4e05c45f55953c9d1126"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pagecolor.sty \
texlive-pagecolor"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-color.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
