SUMMARY = "A pair of fonts for different Georgian alphabets"
DESCRIPTION = "Two Georgian fonts, in both Metafont and Type 1 formats, which \
cover the Mxedruli and the Xucuri alphabets."
LICENSE = "LPPL-1.0"

PV = "2026.226.3.3csvn71991"

RPM_NAME = "texlive-mxedruli-2026.226.3.3csvn71991-61.2.noarch.rpm"
RPM_HASH = "fd39fd7d144bca0f08fe422c1ea4bdaa39d3a331b564da786427fd4ea3b4cfce82f7b6a6ca0f7515052def76f1b3bbf00e97562c2127c72b27d2527d0436f757"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mxed10.tfm \
tex-mxedbf10.tfm \
tex-mxedc10.tfm \
tex-mxedi10.tfm \
tex-mxedruli.map \
tex-mxedruli.sty \
tex-umxed.fd \
tex-uxuc.fd \
tex-xuc10.tfm \
tex-xucuri.sty \
texlive-mxedruli"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-mxedruli-fonts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
