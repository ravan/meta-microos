SUMMARY = "TikZ styles for creating overlaid pictures in beamer"
DESCRIPTION = "The package defines auxiliary TikZ styles useful for overlaying \
pictures' elements in Beamer. The TikZ styles are grouped in a \
library, overlay-beamer-styles which is automatically called by \
the package itself. Users may either load just aobs-tikz or the \
library; the latter method necessitates TikZ manual load."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.01svn70952"

RPM_NAME = "texlive-aobs-tikz-2026.226.1.01svn70952-61.2.noarch.rpm"
RPM_HASH = "5f71aa68ac32bf59338c801d09edea77c472ea0414328a401b78b5211dff4d93fbb0eb68e920db54a3ca0ba4916104187088573f68d72014190e497b781f2fe2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tikzlibraryoverlay-beamer-styles.code.tex \
texlive-aobs-tikz"

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
