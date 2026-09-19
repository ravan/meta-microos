SUMMARY = "A publicity flyer for LaTeX"
DESCRIPTION = "The document is designed as a publicity flyer for LaTeX, but \
also serves as an interesting showcase of what LaTeX can do. \
The flyer is designed for printing, double-sided, on A3 paper, \
which would then be folded once."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn40612"

RPM_NAME = "texlive-latex-brochure-2026.226.svn40612-63.2.noarch.rpm"
RPM_HASH = "3dd4122a1bc4c26f2d0dc0cfc72b2d900cc8dc13f73236d5f5d07a9865cd9af71eb4d7fe6c969538ed4206d381e4f2b3734addd31ca803d8ebf187a6684ea219"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latex-brochure"

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
