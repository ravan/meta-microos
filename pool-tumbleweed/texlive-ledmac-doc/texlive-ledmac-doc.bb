SUMMARY = "Documentation for texlive-ledmac"
DESCRIPTION = "This package includes the documentation for texlive-ledmac"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.19.4svn41811"

RPM_NAME = "texlive-ledmac-doc-2026.226.0.0.19.4svn41811-61.2.noarch.rpm"
RPM_HASH = "50ad16c2705c03c3e7277ec3c611f4581eb38e227be1ee502c8ab4b3385f91ef31eeff7979a6066397b273b46d3d52d97a8d396262fe5e39ee93b9c84551c6be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ledmac-doc"

RDEPENDS:${PN} += ""

inherit rpm
