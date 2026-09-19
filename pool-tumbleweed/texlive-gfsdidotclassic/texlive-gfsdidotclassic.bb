SUMMARY = "The classic version of GFSDidot"
DESCRIPTION = "The classic version of GFSDidot provided for Unicode TeX \
engines."
LICENSE = "OFL-1.1"

PV = "2026.226.001.001svn52778"

RPM_NAME = "texlive-gfsdidotclassic-2026.226.001.001svn52778-60.2.noarch.rpm"
RPM_HASH = "d33333ba153c14b1530a9198b129961e56822232f7042f592c3a8cfb8f9646eb50956ae749aa77a4cd3f0abf4ec146ba59500d4589cca73999b847b200744994"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gfsdidotclassic"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-gfsdidotclassic-fonts \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
