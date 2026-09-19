SUMMARY = "Adjust locations and kerning of CJK punctuation marks"
DESCRIPTION = "The package serves as a companion package for CJK."
LICENSE = "LPPL-1.0"

PV = "2026.226.4.8.4svn41119"

RPM_NAME = "texlive-cjkpunct-2026.226.4.8.4svn41119-60.2.noarch.rpm"
RPM_HASH = "0c4499e1149f0500182fa8a2d3dd19905739da85e1890ce4879992c80b2daf7b0acc75c41829b237ac399c92d4366520c1a34e1488bd4e7e0ff66fb61c8e987a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-CJKpunct.sty \
texlive-cjkpunct"

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
