SUMMARY = "The hfbright fonts"
DESCRIPTION = "These are Adobe Type 1 versions of the OT1-encoded and maths \
parts of the Computer Modern Bright fonts."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn29349"

RPM_NAME = "texlive-hfbright-2026.226.svn29349-60.4.noarch.rpm"
RPM_HASH = "7c5c8d06426149021df4239df0e861bae64dd8af58df93208668b430739f77a91590fc15119f284058decb73548542d93df5aac2997287bd44a8ca6cfc6fa80e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hfbright.map \
tex-hfmital.enc \
tex-hfmsa.enc \
tex-hfmsb.enc \
tex-hfmsym.enc \
tex-hfot1.enc \
texlive-hfbright"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
texlive \
texlive-filesystem \
texlive-hfbright-fonts \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
