SUMMARY = "Greek fonts by Yannis Haralambous"
DESCRIPTION = "A family of 7-bit fonts with a code table designed for setting \
modern polytonic Greek. The fonts are provided as Metafont \
source; macros to produce a Greek variant of Plain TeX \
(including a hyphenation table adapted to the fonts' code \
table) are provided."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn22613"

RPM_NAME = "texlive-yannisgr-2026.226.svn22613-59.4.noarch.rpm"
RPM_HASH = "06f23b9aa98c1e0f907f23b30298d27eaa5900028fcd36d7eb777b0364918c4a9bad62a3f782734f9bae8e3bb231ff28aa59b2d1671b15d900f3e0622e5f23b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mrgrbf10.tfm \
tex-mrgrrg10.tfm \
tex-mrgrsl10.tfm \
tex-mrgrti10.tfm \
tex-rgrbf10.tfm \
tex-rgrrg10.tfm \
tex-rgrsc10.tfm \
tex-rgrsl10.tfm \
tex-rgrti10.tfm \
texlive-yannisgr"

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
