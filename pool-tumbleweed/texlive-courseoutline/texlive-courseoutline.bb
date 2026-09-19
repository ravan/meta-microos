SUMMARY = "Prepare university course outlines"
DESCRIPTION = "Courseoutline is a class designed to minimise markup in a \
tedious task that needs to be repeated often."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn15878"

RPM_NAME = "texlive-courseoutline-2026.226.1.0svn15878-61.2.noarch.rpm"
RPM_HASH = "e4874a511e392cc564fccfa16e30eb1f9e7161ed02087d7fc29edfcdfe329d9f33cd85c9442e8eb4ff1ff045be6bbddee682b488de9a27a2cf833783fb34b8cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-courseoutline.cls \
texlive-courseoutline"

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
