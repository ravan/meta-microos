SUMMARY = "A Beamer presentation theme for the Complexity Science Hub Vienna"
DESCRIPTION = "This package provides a Beamer theme following the corporate \
design of the Complexity Science Hub (CSH) Vienna. It includes \
a title page, automatic section slides, source citation \
commands, and a closing slide with QR code. The theme uses TeX \
Gyre Heros as the default font."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn76967"

RPM_NAME = "texlive-beamertheme-csh-2026.226.1.1svn76967-61.2.noarch.rpm"
RPM_HASH = "85ea701965586ca3b575d3973ae22f9e9b757528cb1eba5dd7cdd365adb25c7e2b1be9bb092ecec2f3a36f78b89b2a295442eaf727ee4d3e28f7c4fe76b19ed7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-beamercolorthemecsh.sty \
tex-beamerinnerthemecsh.sty \
tex-beamerouterthemecsh.sty \
tex-beamerthemecsh.sty \
texlive-beamertheme-csh"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-lastpage.sty \
tex-qrcode.sty \
tex-tgheros.sty \
tex-tikz.sty \
tex-totcount.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
