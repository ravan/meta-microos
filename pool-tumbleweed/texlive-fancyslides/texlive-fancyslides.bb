SUMMARY = "Custom presentation class built upon LaTeX Beamer"
DESCRIPTION = "This class is prepared for short presentations with a modern \
look & feel. It offers the following features: custom \
background for each slide, predefined types of slides, \
simplified commands (e.g. for starting and ending slide). The \
class is built upon LaTeX beamer, so all beamer commands should \
work."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn36263"

RPM_NAME = "texlive-fancyslides-2026.226.1.0svn36263-59.2.noarch.rpm"
RPM_HASH = "52b19d4018411c5f604e01d1807dfb6ffa5ebb1610f40d9bfc6f4b754756725ff7ade52e5b32a510bf5d76384a50020b85b230956a53488bb83ceb2da283c332"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fancyslides.cls \
texlive-fancyslides"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-framed.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
