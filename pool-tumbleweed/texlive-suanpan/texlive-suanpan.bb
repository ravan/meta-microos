SUMMARY = "MetaPost macros for drawing Chinese and Japanese abaci"
DESCRIPTION = "These macros are described in Denis Roegel: MetaPost macros for \
drawing Chinese and Japanese abaci, TUGboat (volume 30, number \
1, 2009, pages 74-79)"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-suanpan-2026.226.svn15878-64.2.noarch.rpm"
RPM_HASH = "b05dabbf2bb4d2ce7fa74194461acc323c343f1d6df2f2c6751e39ffb0622ae780305715c05822f0617d3e8bf7716db12f92619812f68b1d0cc2d65c868fdae9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-suanpan"

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
