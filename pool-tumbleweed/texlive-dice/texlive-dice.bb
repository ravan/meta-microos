SUMMARY = "A font for die faces"
DESCRIPTION = "A Metafont font that can produce die faces in 2D or with \
various 3D effects."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn28501"

RPM_NAME = "texlive-dice-2026.226.svn28501-59.2.noarch.rpm"
RPM_HASH = "6c8c918ec66463c2bc4ced945ea983a980817c1eb81f2af01157a666b96265c5d37977fafc3fb4eb747b166aa3db740175b0cdbfd2d2c1bd44a78fa735f56bf0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-dice3d.tfm \
texlive-dice"

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
