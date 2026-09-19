SUMMARY = "Documentation for texlive-rubik"
DESCRIPTION = "This package includes the documentation for texlive-rubik"
LICENSE = "LPPL-1.0"

PV = "2026.226.5.0svn46791"

RPM_NAME = "texlive-rubik-doc-2026.226.5.0svn46791-60.2.noarch.rpm"
RPM_HASH = "273fe67f78f8771f63ebc584ec30974e8b540cde0b1cc037ac2d52781576ab6a45764c2c63ba5f1a8d8f57d5f55bf6fd5c7ee14c16d8ae68367feb34e662170e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-rubikrotation.1 \
texlive-rubik-doc"

RDEPENDS:${PN} += ""

inherit rpm
