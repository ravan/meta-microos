SUMMARY = "Vietnamese translation of AMSLaTeX documentation"
DESCRIPTION = "This is a Vietnamese translation of amsldoc, the users' guide \
to amsmath."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0svn21855"

RPM_NAME = "texlive-amsldoc-vn-2026.226.2.0svn21855-61.2.noarch.rpm"
RPM_HASH = "c04efd611a3cd727dcb4a5ea21f86cb9390e522870ae0e9a173cab1cae7b50f463c8ee637921d793059e842b27ec2e418d3ed0698df40e0f95daa46c8a722611"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-amsldoc-vn"

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
