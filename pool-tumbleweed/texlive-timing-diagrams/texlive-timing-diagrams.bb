SUMMARY = "Draw timing diagrams"
DESCRIPTION = "The package provides commands to draw and annotate various \
kinds of timing diagrams, using Tikz. Documentation is sparse, \
but the source and the examples file should be of some use."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn31491"

RPM_NAME = "texlive-timing-diagrams-2026.226.svn31491-59.2.noarch.rpm"
RPM_HASH = "e68a5ff593c52478092dd7bb83b55bcb33c540ba0a8bfdfa3f512564acfc8253f057503acea1f800057977280c94ed8cf750065d939529c26f10dc060dda5fd4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-timing-diagrams.sty \
texlive-timing-diagrams"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
