SUMMARY = "University of Southampton-compliant slides"
DESCRIPTION = "The bundle contains two packages: soton-palette which defines \
colour-ways, and soton-beamer, which uses the colours to \
produce compliant presentations."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn16215"

RPM_NAME = "texlive-soton-2026.226.0.0.1svn16215-64.2.noarch.rpm"
RPM_HASH = "1177ab31f54de7ba14d96f348db48346e0dbc9840c391c855ba5de6c10c97ca31ef2460b76f850988fe300fd8e3afa53ccb332f7dbc807a49910ee9f66883123"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-soton-beamer.sty \
tex-soton-palette.sty \
texlive-soton"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
