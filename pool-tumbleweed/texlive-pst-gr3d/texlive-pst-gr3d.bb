SUMMARY = "Three dimensional grids with PSTricks"
DESCRIPTION = "This PSTricks package provides a command \\PstGridThreeD that \
will draw a three dimensional grid, offering a number of \
options for its appearance."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.34svn15878"

RPM_NAME = "texlive-pst-gr3d-2026.226.1.34svn15878-59.2.noarch.rpm"
RPM_HASH = "69c4bb98c3dcaf5a91806f979e3bb1299d1e8d45fee4acd80207a2aaf6655112b0f9b02a08bcb83d6035be15b379e39e795cd89586e4cb4278d19d5d259a20b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-gr3d.sty \
tex-pst-gr3d.tex \
texlive-pst-gr3d"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
