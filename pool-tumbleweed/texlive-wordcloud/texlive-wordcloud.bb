SUMMARY = "Drawing wordclouds with MetaPost and Lua"
DESCRIPTION = "This MetaPost and LuaLaTeX package allows drawing wordclouds \
from a list of words and weights. The algorithm is implemented \
with MetaPost whereas Lua is used to parse LaTeX commands, to \
build the list of words and weights from a text file and to \
generate MetaPost code interpreted by luamplib."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3svn77682"

RPM_NAME = "texlive-wordcloud-2026.226.0.0.3svn77682-60.2.noarch.rpm"
RPM_HASH = "c962d6eceefef5045de5f5cc3a128d102a155c82324bc207cfdeeaed2b3a1f5f24f0c3f1eb543b9522b218249430fceec6fd6f6e72fb67b82566f27a581ae014"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-wordcloud.sty \
texlive-wordcloud"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-luamplib.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
