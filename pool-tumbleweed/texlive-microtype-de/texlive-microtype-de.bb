SUMMARY = "Translation into German of the documentation of microtype"
DESCRIPTION = "The microtype-de package"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.4svn54080"

RPM_NAME = "texlive-microtype-de-2026.226.2.4svn54080-61.2.noarch.rpm"
RPM_HASH = "34114fc0e67c916001486c6edeb1f712a4f96c39b786db3d60b7c62cba2f49d96f250e56fbf8a54a5d9a5f54d0549bc71249a357439cdf7ba4666943a6fae8e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-microtype-de"

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
