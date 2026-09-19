SUMMARY = "Linear A script fonts"
DESCRIPTION = "The linearA package provides a simple interface to two fonts \
which include all known symbols, simple and complex, of the \
Linear A script. This way one can easily replicate Linear A \
'texts' using modern typographic technology. Note that the \
Linear A script has not been deciphered yet and probably never \
will be deciphered."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn63169"

RPM_NAME = "texlive-lineara-2026.226.svn63169-61.2.noarch.rpm"
RPM_HASH = "d87e2d9eeb0996fbe6f63f4b456251a3533ff7239f17c1545283ff087d6c5ac2661d9687947a52204699f4e45699173fdcac75f66c3f4d28d3d1900b25e459f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-LinearA.tfm \
tex-LinearACmplxSigns.tfm \
tex-linearA.map \
tex-linearA.sty \
texlive-lineara"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-lineara-fonts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
