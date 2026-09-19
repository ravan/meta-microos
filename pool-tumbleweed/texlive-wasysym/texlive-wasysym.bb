SUMMARY = "LaTeX support for the wasy fonts"
DESCRIPTION = "The wasy (Waldi Symbol) font by Roland Waldi provides many \
glyphs like male and female symbols and astronomical symbols, \
as well as the complete lasy font set and other odds and ends. \
This package implements an easy to use interface for these \
symbols."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.4svn77682"

RPM_NAME = "texlive-wasysym-2026.226.2.4svn77682-60.2.noarch.rpm"
RPM_HASH = "e96c1ffa8b10c7adc31857435470e8c57e4c81ac58e0dc2a89e636da0bfca07a93f218c2d94ad58ec698025df6f21cd67e9da61d3803c26167c488931e6390a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-uwasy.fd \
tex-uwasyvar.fd \
tex-wasysym.sty \
texlive-wasysym"

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
