SUMMARY = "Insert a graphical image as a background"
DESCRIPTION = "The package defines two new commands \\graphicxbox and \
\\fgraphicxbox, which are companions to \\colorbox and \\fcolorbox \
of the Standard LaTeX color package. The \\graphicxbox command \
inserts a graphical image as a background rather than a \
background color, while \\fgraphicxbox does the same thing, but \
also draws a colored frame around the box."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn32630"

RPM_NAME = "texlive-graphicxbox-2026.226.1.0svn32630-60.4.noarch.rpm"
RPM_HASH = "1552b6837835dc6ddb9d5bd024fa4bc9147851a9e0c4bcf55697f047667cd83bbaf828135aeb9aae91f913d5fa434b61f1484109578f6de08b4081041dd4f362"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-graphicxbox.sty \
texlive-graphicxbox"

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
