SUMMARY = "Generate astrological charts in LaTeX"
DESCRIPTION = "The horoscop package provides a unified interface for \
astrological font packages; typesetting with pict2e of standard \
wheel charts and some variations, in PostScript- and \
PDF-generating TeX engines; and access to external calculation \
software (Astrolog and Swiss Ephemeris) for computing object \
positions."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.1.01svn56021"

RPM_NAME = "texlive-horoscop-2026.226.1.01svn56021-60.4.noarch.rpm"
RPM_HASH = "af158cd159320322cc21884500cd5013f1dde82fdcf9981920381cb38a3355beb2ee8cf8769f19341cd58fc4151e0a7e8e5dd8be719ecfff20ee8e9ec858592a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-horoscop.sty \
texlive-horoscop"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-iftex.sty \
tex-marvosym.sty \
tex-pict2e.sty \
tex-starfont.sty \
tex-trig.sty \
tex-wasysym.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
