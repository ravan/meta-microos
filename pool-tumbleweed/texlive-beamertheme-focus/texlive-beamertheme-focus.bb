SUMMARY = "A minimalist presentation theme for LaTeX Beamer"
DESCRIPTION = "A presentation theme for LaTeX Beamer that aims at a clean and \
minimalist design, so to minimize distractions and put the \
focus directly on the content."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.3.4.0svn69742"

RPM_NAME = "texlive-beamertheme-focus-2026.226.3.4.0svn69742-61.2.noarch.rpm"
RPM_HASH = "04e795040be3118fc74f3654bc317b8ef948a2ceb082ac3453a3d419f78467bc1105a1cda8aa0c5db9589d2545f42aa4787164a8eb0a1ebe2e8710361e3dbba0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-beamercolorthemefocus.sty \
tex-beamerfontthemefocus.sty \
tex-beamerinnerthemefocus.sty \
tex-beamerouterthemefocus.sty \
tex-beamerthemefocus.sty \
texlive-beamertheme-focus"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-FiraMono.sty \
tex-FiraSans.sty \
tex-appendixnumberbeamer.sty \
tex-bookmark.sty \
tex-etoolbox.sty \
tex-firamath-otf.sty \
tex-fontenc.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
