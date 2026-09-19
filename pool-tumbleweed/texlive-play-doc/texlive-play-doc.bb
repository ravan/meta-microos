SUMMARY = "Documentation for texlive-play"
DESCRIPTION = "This package includes the documentation for texlive-play"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-play-doc-2026.226.svn15878-59.2.noarch.rpm"
RPM_HASH = "654610429f9ffed371af8ce6f421fb768d9d5e64b3d3a0d2f6af05b01fe7cd04a78f8cdab93f42498a825d02d21ec8a519e6640316fc1763b00cd4b4bb904522"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-play-doc"

RDEPENDS:${PN} += ""

inherit rpm
