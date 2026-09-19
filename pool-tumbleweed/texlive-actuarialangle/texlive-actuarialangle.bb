SUMMARY = "Angle symbol denoting a duration in actuarial and financial notation"
DESCRIPTION = "This package provides commands to typeset the 'angle' symbol \
denoting a duration in actuarial notation, such as in symbols \
for the present value of certain or life annuities, and an over \
angle square bracket used to emphasize joint status in symbols \
of life contingencies."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.1svn67201"

RPM_NAME = "texlive-actuarialangle-2026.226.2.1svn67201-61.2.noarch.rpm"
RPM_HASH = "4c35b7892f03e5c56dd6903c6f8e9aa16af6f06d8affa8150e198101e354eac23ec34b36dc79417e2bf5b4e0a69e5497fb366c51188beb64247e46dbd9bad671"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-actuarialangle.sty \
texlive-actuarialangle"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pict2e.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
