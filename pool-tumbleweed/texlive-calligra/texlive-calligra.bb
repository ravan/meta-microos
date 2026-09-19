SUMMARY = "Calligraphic font"
DESCRIPTION = "A calligraphic font in the handwriting style of the author, \
Peter Vanroose. The font is supplied as Metafont source. LaTeX \
support of the font is provided in the calligra package in the \
fundus bundle."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-calligra-2026.226.svn15878-59.2.noarch.rpm"
RPM_HASH = "d11768a96ebb575859e0956b0a6e85d661999996df5a1154864c077b7511746524c21f7416b94a62d0af6a2bb3cb04d911e0d2f11c3a1c4657bfbdb426de2188"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-callig15.tfm \
texlive-calligra"

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
