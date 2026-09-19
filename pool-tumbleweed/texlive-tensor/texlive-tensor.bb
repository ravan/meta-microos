SUMMARY = "Typeset tensors"
DESCRIPTION = "A package which allows the user to set tensor-style super- and \
subscripts with offsets between successive indices. It supports \
the typesetting of tensors with mixed upper and lower indices \
with spacing, also typeset preposed indices. This is a complete \
revision and extension of the original 'tensor' package by Mike \
Piff."
LICENSE = "LPPL-1.0"

PV = "2026.227.2.2svn77682"

RPM_NAME = "texlive-tensor-2026.227.2.2svn77682-62.2.noarch.rpm"
RPM_HASH = "16b83572df3ceec15ae486700263193be0fcf64c31f4409548ad1196b5bde1f737a450c681f223ef2796ff8d2c51ca52258ba9a785d47851e7c99ecfa98217cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tensor.sty \
texlive-tensor"

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
