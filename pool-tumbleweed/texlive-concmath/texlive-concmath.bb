SUMMARY = "Concrete Math fonts"
DESCRIPTION = "A LaTeX package and font definition files to access the \
Concrete mathematics fonts, which were derived from Computer \
Modern math fonts using parameters from Concrete Roman text \
fonts."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn17219"

RPM_NAME = "texlive-concmath-2026.226.svn17219-60.2.noarch.rpm"
RPM_HASH = "b5fa629abc3d32c82f327526980680dac2982c2b11b2153ed945d6153cdad0396194e50ed1b00039c7b1a217e4a02456995f129d743ccd7cdc4429d00163ec8a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-concmath.sty \
tex-omlccm.fd \
tex-omlccr.fd \
tex-omsccr.fd \
tex-omsccsy.fd \
tex-omxccex.fd \
tex-ot1ccr.fd \
tex-ucca.fd \
tex-uccb.fd \
texlive-concmath"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsfonts.sty \
tex-amssymb.sty \
tex-exscale.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
