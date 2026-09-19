SUMMARY = "TeX Live manual (French)"
DESCRIPTION = "The texlive-fr package"
LICENSE = "LPPL-1.0"

PV = "2026.227.svn78031"

RPM_NAME = "texlive-texlive-fr-2026.227.svn78031-62.2.noarch.rpm"
RPM_HASH = "142071d1c0c01187b5077034353551f4af5cf0e2a10252ef5514df1e0c4e6fbc2dcfd769f6baec1c4402e4ffa3b5cd0fbcdb2f515edc1460643ffecfe8e6f6c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-texlive-fr"

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
