SUMMARY = "A simple beamer theme using the 'Nord' color theme"
DESCRIPTION = "This package provides a simple beamer theme using the Nord \
color theme."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2.0svn56180"

RPM_NAME = "texlive-beamerthemenord-2026.226.0.0.2.0svn56180-61.2.noarch.rpm"
RPM_HASH = "12aac5551022f74f0f44fca41a7992099b6e4539248a1bfa9246f2621fc167566298df2f16088673675d4a1064a20ddffa18095b537e0e03d703651950cb0c91"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-beamercolorthemeNord.sty \
tex-beamerfontthemeNord.sty \
tex-beamerthemeNord.sty \
texlive-beamerthemenord"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
