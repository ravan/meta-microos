SUMMARY = "Documentation for texlive-beamertheme-epyt"
DESCRIPTION = "This package includes the documentation for texlive-beamertheme-epyt"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn41404"

RPM_NAME = "texlive-beamertheme-epyt-doc-2026.226.1.0svn41404-61.2.noarch.rpm"
RPM_HASH = "925d1a147303f11c8f48ca2f3d41861c890d72512ae56eec78cc2d2391ada50db12efa236d3db3a380bbb704a0c4e97101ece36cbf6f6c674ff99bede61a7d92"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-beamertheme-epyt-doc-zh \
texlive-beamertheme-epyt-doc"

RDEPENDS:${PN} += ""

inherit rpm
