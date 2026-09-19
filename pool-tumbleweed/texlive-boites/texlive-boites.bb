SUMMARY = "Boxes that may break across pages"
DESCRIPTION = "Defines environments that allow page breaks inside framed boxes \
whose edges may be variously fancy. The bundle includes a few \
examples (shaded box, box with a wavy line on its side, etc)."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.1svn32235"

RPM_NAME = "texlive-boites-2026.226.1.1svn32235-59.2.noarch.rpm"
RPM_HASH = "ef1ce39906a385cdafed382a4df7028ba846de1a2eddf54736a1821ac095ffca17ec35fbb338ad91dca4cc4ba413d97f38fed8b295602d86d79a26ab0f4b2d4c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-boites-exemples.sty \
tex-boites.sty \
texlive-boites"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-color.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
