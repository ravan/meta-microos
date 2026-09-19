SUMMARY = "Interface between foiltex and LaTeX2HTML"
DESCRIPTION = "Provides integration between FoilTeX and LaTeX2HTML, adding \
sectioning commands and elements of logical formatting to \
FoilTeX and providing support for FoilTeX commands in \
LaTeX2HTML."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn61937"

RPM_NAME = "texlive-foilhtml-2026.226.1.2svn61937-60.2.noarch.rpm"
RPM_HASH = "f14ba4bbbc1b29c9d24f5d66d14d0a5ba4c5cc30dfb7681a5188430cc0b5536000ad21672a4b2aa89d6ac928c100a2444b662d65563a98a949cb41d452b57514"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-foilhtml.cfg \
tex-foilhtml.sty \
texlive-foilhtml"

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
