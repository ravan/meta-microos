SUMMARY = "A short tutorial on using tlmgr in Chinese"
DESCRIPTION = "This is a Chinese translation of the tlmgr documentation. It \
introduces some of the common usage of the TeX Live Manager. \
The original can be found in the tlmgrbasics package."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn59100"

RPM_NAME = "texlive-tlmgr-intro-zh-cn-2026.226.svn59100-59.2.noarch.rpm"
RPM_HASH = "f3308cadec8ee36100b0e41bd726d4fe33548870f7794d0007282961b2ee8c780dbf4472e9633e4ec87dcefad84e217d962ddfdc1170ed7637161e05fe9972d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tlmgr-intro-zh-cn"

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
