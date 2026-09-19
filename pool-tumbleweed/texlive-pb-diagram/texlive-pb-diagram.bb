SUMMARY = "A commutative diagram package using LAMSTeX or Xy-pic fonts"
DESCRIPTION = "The pb-diagram package"
LICENSE = "LPPL-1.0"

PV = "2026.226.5.0svn15878"

RPM_NAME = "texlive-pb-diagram-2026.226.5.0svn15878-58.2.noarch.rpm"
RPM_HASH = "2801e767bd5267cf61d54015f1158bbfb1909f792e017a05199fba6b249aef38d648c04cad3dec71a802cc977a5f6ce8419b886773fa6a05f95a4040816df86c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-lamsarrow.sty \
tex-pb-diagram.sty \
tex-pb-lams.sty \
tex-pb-xy.sty \
texlive-pb-diagram"

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
