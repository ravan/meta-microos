SUMMARY = "Put labels on images using TikZ"
DESCRIPTION = "This package allows to add label texts to an existing image \
with the aid of TikZ. This may be used to label certain \
features in an image."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn51490"

RPM_NAME = "texlive-tikz-imagelabels-2026.226.0.0.2svn51490-59.2.noarch.rpm"
RPM_HASH = "8b0c63c4da60127a5301f3ad86cab1221108d139bd8a94bf3b8268ce06b18e59510706a06db47a9fcb4ab9e27a5f8fe80ea9367a7e3ab0ab3434b4ed238d1c5b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tikz-imagelabels.sty \
texlive-tikz-imagelabels"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-tikz.sty \
tex-xifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
