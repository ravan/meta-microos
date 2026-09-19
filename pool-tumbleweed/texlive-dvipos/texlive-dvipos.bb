SUMMARY = "Support DVI pos: specials used by ConTeXt DVI output"
DESCRIPTION = "The dvipos package"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn66186"

RPM_NAME = "texlive-dvipos-2026.226.svn66186-61.4.noarch.rpm"
RPM_HASH = "87e5753971881f9b3a7e1e9bd3c26a8f294d4453678ce6fba1ed5d3d344f1749e523f2f19cc32d3e19539b2b09fdefdb3d93e74c8d9ca0352c3a1ccc2533588b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-dvipos.1 \
texlive-dvipos"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-dvipos-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
