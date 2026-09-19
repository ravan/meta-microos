SUMMARY = "Luatexja-jfm files for Chinese typesetting"
DESCRIPTION = "ChineseJFM is a series of luatexja-jfm files for better Chinese \
typesetting, providing quanjiao, banjiao, and kaiming three \
styles and other fancy features. It can be used for both \
horizontal and vertical writing mode in Simplified/Traditional \
Chinese or Japanese fonts."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1.1svn57758"

RPM_NAME = "texlive-chinese-jfm-2026.226.1.1.1svn57758-60.2.noarch.rpm"
RPM_HASH = "572433115314fa75e9dcd5600e82b180f63ee2ac1ee9be2aa03e8a7ca62042e2883d3ab541519bbf5d9fda0c88afa8327f47986a225834b3280f99919553c97d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-chinese-jfm"

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
