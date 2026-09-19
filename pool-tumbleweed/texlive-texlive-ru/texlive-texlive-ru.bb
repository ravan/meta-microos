SUMMARY = "TeX Live manual (Russian)"
DESCRIPTION = "The texlive-ru package"
LICENSE = "LPPL-1.0"

PV = "2026.227.svn58426"

RPM_NAME = "texlive-texlive-ru-2026.227.svn58426-62.2.noarch.rpm"
RPM_HASH = "06b8c2d9c26505bd9821bcaf7ad959aaf348f650209db390a360394b6c45032be65a1c03a206dae14644598f781de572cd1cf981637dae5ddb586804fb8d30f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-texlive-ru"

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
