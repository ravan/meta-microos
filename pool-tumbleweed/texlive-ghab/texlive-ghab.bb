SUMMARY = "Typeset ghab boxes in LaTeX"
DESCRIPTION = "The package defines a command \\darghab that will typeset its \
argument in a box with a decorated frame. The width of the box \
may be set using an optional argument."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.5svn29803"

RPM_NAME = "texlive-ghab-2026.226.0.0.5svn29803-60.2.noarch.rpm"
RPM_HASH = "a54fc8f2966a4789637b2e914ae77639a259cf47ac106d76cf6b53f493e92ea48fdecdf911b40d6484e92499bcb090cdc8cdcf6a10811597b58cb48522a102ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ghab.sty \
texlive-ghab"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-biditools.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
