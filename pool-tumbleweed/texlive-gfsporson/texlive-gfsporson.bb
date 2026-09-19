SUMMARY = "A Greek font, originally from Porson"
DESCRIPTION = "Porson is an elegant Greek font, originally cut at the turn of \
the 19th Century in England. The present version has been \
provided by the Greek Font Society. The font supports the Greek \
alphabet only. LaTeX support is provided, using the LGR \
encoding."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.01svn77682"

RPM_NAME = "texlive-gfsporson-2026.226.1.01svn77682-60.2.noarch.rpm"
RPM_HASH = "95a3b6c3e49553fcaeff5177d119bf30a5405c008afe4897e96e2404c386b598271a7fdd3b5ce9b7d3df30a05119ebc5f39149b75e14bb42098ad46d98037225"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-gfsporson.map \
tex-gfsporson.sty \
tex-gporsonrg6a.tfm \
tex-gporsonrg6a.vf \
tex-gporsonrg6r.tfm \
tex-lgrporson.fd \
tex-porsonel.enc \
texlive-gfsporson"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
texlive \
texlive-filesystem \
texlive-gfsporson-fonts \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
