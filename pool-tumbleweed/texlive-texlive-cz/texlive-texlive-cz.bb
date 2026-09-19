SUMMARY = "TeX Live manual (Czech/Slovak)"
DESCRIPTION = "The texlive-cz package"
LICENSE = "LPPL-1.0"

PV = "2026.227.svn77067"

RPM_NAME = "texlive-texlive-cz-2026.227.svn77067-62.2.noarch.rpm"
RPM_HASH = "0e230ed42115f1330c50c68be54a72dc7fdefa6925bfb147c8de5e422d3b6ae433025dca4f7393630e03cbdb8cec0d83f393cddd78bcd06ce707614c5843bc1d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-texlive-cz"

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
