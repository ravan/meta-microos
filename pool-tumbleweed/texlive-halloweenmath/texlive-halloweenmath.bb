SUMMARY = "Scary and creepy math symbols with AMS-LaTeX integration"
DESCRIPTION = "The package defines a handful of commands for typesetting \
mathematical symbols of various kinds, ranging from 'large' \
operators to extensible arrow-like relations and growing \
arrow-like math accents that all draw from the classic \
Halloween-related iconography (pumpkins, witches, ghosts, cats, \
and so on) while being, at the same time, seamlessly integrated \
within the rest of the mathematics produced by (AmS-)LaTeX."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.11svn77682"

RPM_NAME = "texlive-halloweenmath-2026.226.0.0.11svn77682-60.4.noarch.rpm"
RPM_HASH = "691f6489dc8b71e5df05c83ebad66b91846cb7a8ef288ff8c23718ec129101aca7c03d36a627b045a6937de372620665e2897a918aa9e667bdfedccd7b7d3bf6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-halloweenmath.sty \
texlive-halloweenmath"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-pict2e.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
