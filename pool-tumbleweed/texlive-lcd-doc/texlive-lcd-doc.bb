SUMMARY = "Documentation for texlive-lcd"
DESCRIPTION = "This package includes the documentation for texlive-lcd"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3svn16549"

RPM_NAME = "texlive-lcd-doc-2026.226.0.0.3svn16549-61.2.noarch.rpm"
RPM_HASH = "90e8bdf58be4c114a0847e4e041ea658c8d058c3be0fce8b8f85fb1bd1cd5e90c1726847287d5160d7f8dcf199584278d3d96b8576e21bafda361ffd3ba9ec27"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lcd-doc"

RDEPENDS:${PN} += ""

inherit rpm
