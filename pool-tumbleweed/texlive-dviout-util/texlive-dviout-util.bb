SUMMARY = "Package dviout-util"
DESCRIPTION = "The dviout-util package"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn66186"

RPM_NAME = "texlive-dviout-util-2026.226.svn66186-61.4.noarch.rpm"
RPM_HASH = "b1989b3e8aab8705f72bed9a4ef41281c73f0e735dbe7a14d21dd8d5ce46a3ba93f6842fab9e1766a24a61790650dabcc5d14493adb80c881a90691127c840cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-chkdvifont.1 \
man-dvispc.1 \
texlive-dviout-util"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-dviout-util-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
