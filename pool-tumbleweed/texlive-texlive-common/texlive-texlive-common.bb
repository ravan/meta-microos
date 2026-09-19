SUMMARY = "TeX Live documentation (common elements)"
DESCRIPTION = "The texlive-common package"
LICENSE = "LPPL-1.0"

PV = "2026.227.svn77830"

RPM_NAME = "texlive-texlive-common-2026.227.svn77830-62.2.noarch.rpm"
RPM_HASH = "1bcbc51871f6bc12ac2632e9f92e7f36d4d3c6749eeb65d8c14aee6afde7f4a9e461159d3cfe87fae3f378cfdadc812fbf07f3b19e150d9e27acdd501e5a2a05"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-texlive-common"

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
