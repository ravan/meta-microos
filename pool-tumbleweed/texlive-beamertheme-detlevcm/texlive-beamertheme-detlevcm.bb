SUMMARY = "A beamer theme designed for use in the University of Leeds"
DESCRIPTION = "The bundle provides a simple theme that has been used in the \
author's department."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.02svn39048"

RPM_NAME = "texlive-beamertheme-detlevcm-2026.226.1.02svn39048-61.2.noarch.rpm"
RPM_HASH = "3620a9e0fd487fadb8ce0341ee3bbf8da7e0277ca672d1e5f74240128a13cdbed693785456a76da7c858b5b13ab9343ee1d2d27fa273a0f11e2a23f84e423c45"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-beamercolorthemeETII.sty \
tex-beamerfontthemeDetlevCM.sty \
tex-beamerouterthemeDetlevCM.sty \
tex-beamerthemeDetlevCM.sty \
texlive-beamertheme-detlevcm"

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
