SUMMARY = "Insert inline images, with automatic size/positioning"
DESCRIPTION = "Insert inline images (based on graphicx), with automatic \
size/positioning."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.20asvn78036"

RPM_NAME = "texlive-inlinegraphicx-2026.226.0.0.20asvn78036-60.2.noarch.rpm"
RPM_HASH = "665105f92270a3d6152660727ef640c2a112750c027b2a79b20e2c2c050c10b0cc39f04b699bbf276479d65517b6041edc51772d8fda441fb13f269e400aac9f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-inlinegraphicx.sty \
texlive-inlinegraphicx"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphicx.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
