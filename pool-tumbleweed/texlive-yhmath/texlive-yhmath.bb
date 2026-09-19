SUMMARY = "Extended maths fonts for LaTeX"
DESCRIPTION = "The yhmath bundle contains fonts (in Metafont and type 1 \
format) and a LaTeX package for using them."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.6svn77682"

RPM_NAME = "texlive-yhmath-2026.226.1.6svn77682-59.4.noarch.rpm"
RPM_HASH = "02002b66693f1709d02503e06692ddaf72337d49f5af1040b01e60844297685b20d05b5e281421ec32ddfe9e7317bd0cf5918ae79a882256f2b988097dbadafd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-OMXyhex.fd \
tex-yhcmex10.tfm \
tex-yhcmex10.vf \
tex-yhmath.map \
tex-yhmath.sty \
tex-yrcmex10.tfm \
texlive-yhmath"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-updmap.cfg \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-yhmath-fonts"

inherit rpm
