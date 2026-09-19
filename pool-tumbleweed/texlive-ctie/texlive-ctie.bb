SUMMARY = "C version of tie (merging Web change files)"
DESCRIPTION = "This is a version of tie converted for use with cweb."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.1svn77830"

RPM_NAME = "texlive-ctie-2026.226.1.1svn77830-61.2.noarch.rpm"
RPM_HASH = "a3d14a10b0ab4a6e962ba675d8d88e0c5a0fa4611612d2bb7f1fc4b9d7324d88c0a48716d26c56d4d7cfdcd1261b6b5371918cf7e3d474edb6053baabee66ede"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-ctie.1 \
texlive-ctie"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-ctie-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
