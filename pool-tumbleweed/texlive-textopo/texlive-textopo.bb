SUMMARY = "Annotated membrane protein topology plots"
DESCRIPTION = "A LaTeX package for setting shaded and annotated membrane \
protein topology plots and helical wheels."
LICENSE = "GPL-2.0-or-later"

PV = "2026.227.1.5svn23796"

RPM_NAME = "texlive-textopo-2026.227.1.5svn23796-62.2.noarch.rpm"
RPM_HASH = "ebbddcb80ae477d1b54979b3e9d0f28032776f37028e8e83b5152b0f025e2e053c01af8bf6867bfb8e683b754647118b08aa3ae5f72820ec96f0b4c549621c65"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-biotex.sty \
tex-textopo.def \
tex-textopo.sty \
texlive-textopo"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-color.sty \
tex-graphics.sty \
tex-texshade.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
