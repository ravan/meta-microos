SUMMARY = "A simple and clean theme for LaTeX beamer class"
DESCRIPTION = "This package provides a simple but nice theme for Beamer, with \
the following features: simple structure: with page numbers at \
footer, no head bar and side bar simple templates: displaying \
theorems with traditional inline style simple colors: using \
only several foreground and background colors"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn41404"

RPM_NAME = "texlive-beamertheme-epyt-2026.226.1.0svn41404-61.2.noarch.rpm"
RPM_HASH = "7dda6b18186384edf6e06c8a464e6a8f7fcdfb8f1fd7f17972d249429f19b714e4771dcdfa8a5e222427dc775b451b2e00c82ccd79cc04a9084543a7079a71c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-beamerthemeepyt.sty \
texlive-beamertheme-epyt"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-arev.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
