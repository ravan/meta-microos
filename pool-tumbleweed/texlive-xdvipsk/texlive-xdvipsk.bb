SUMMARY = "Package xdvipsk"
DESCRIPTION = "The xdvipsk package"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77931"

RPM_NAME = "texlive-xdvipsk-2026.226.svn77931-59.4.noarch.rpm"
RPM_HASH = "517302513fee0e0ba18d218c44590e0baa8e59cb8a3f621df2382c49a3424fac17d64e1d6b70fb6f1c7eb450693aa1bee8d9e7263dfb0a8ddbf159ff0b6cfa45"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xdvipsk"

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
texlive-scripts-bin \
texlive-xdvipsk-bin \
texlive-xdvipsk-support"

inherit rpm
