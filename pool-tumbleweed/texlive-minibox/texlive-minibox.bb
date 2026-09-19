SUMMARY = "A simple type of box for LaTeX"
DESCRIPTION = "This small package provides a convenient input syntax for boxes \
that don't break their text over lines automatically, but do \
allow manual line breaks. The boxes shrink to the natural width \
of the longest line they contain."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2asvn77682"

RPM_NAME = "texlive-minibox-2026.226.0.0.2asvn77682-61.2.noarch.rpm"
RPM_HASH = "17c444e8e698be4bdec0c19ee7074cb68b78abf6ca99ba90201a10331ee1d3470f1c62b9a857b158e8c044669e9543fd599068ab2442f11a8b2b4dd198ddb0db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-minibox.sty \
texlive-minibox"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
