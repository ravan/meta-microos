SUMMARY = "'Blackboard-style' cm fonts"
DESCRIPTION = "Blackboard variants of Computer Modern fonts. The fonts are \
distributed as Metafont source (only); LaTeX support is \
available with the bbm-macros package. The Sauter font package \
has Metafont parameter source files for building the fonts at \
more sizes than you could reasonably imagine. A sample of these \
fonts appears in the blackboard bold sampler."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-bbm-2026.226.svn77682-61.2.noarch.rpm"
RPM_HASH = "81d21b8f8813bca5f73c5a9467c6a616cb5138afa1f71b87ea2ffc247daed3ad73ca1f0a569a3b9f73f57e54731f50cbcb0e01d6dfff7c9881dcbd3c19e43e11"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bbm10.tfm \
tex-bbm12.tfm \
tex-bbm17.tfm \
tex-bbm5.tfm \
tex-bbm6.tfm \
tex-bbm7.tfm \
tex-bbm8.tfm \
tex-bbm9.tfm \
tex-bbmb10.tfm \
tex-bbmbx10.tfm \
tex-bbmbx12.tfm \
tex-bbmbx5.tfm \
tex-bbmbx6.tfm \
tex-bbmbx7.tfm \
tex-bbmbx8.tfm \
tex-bbmbx9.tfm \
tex-bbmbxsl10.tfm \
tex-bbmdunh10.tfm \
tex-bbmfib8.tfm \
tex-bbmfxib8.tfm \
tex-bbmsl10.tfm \
tex-bbmsl12.tfm \
tex-bbmsl8.tfm \
tex-bbmsl9.tfm \
tex-bbmss10.tfm \
tex-bbmss12.tfm \
tex-bbmss17.tfm \
tex-bbmss8.tfm \
tex-bbmss9.tfm \
tex-bbmssbx10.tfm \
tex-bbmssdc10.tfm \
tex-bbmssi10.tfm \
tex-bbmssi12.tfm \
tex-bbmssi17.tfm \
tex-bbmssi8.tfm \
tex-bbmssi9.tfm \
tex-bbmssq8.tfm \
tex-bbmssqi8.tfm \
tex-bbmtt10.tfm \
tex-bbmtt12.tfm \
tex-bbmtt8.tfm \
tex-bbmtt9.tfm \
texlive-bbm"

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
