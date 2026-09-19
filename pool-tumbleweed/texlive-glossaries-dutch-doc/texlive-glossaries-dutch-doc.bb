SUMMARY = "Documentation for texlive-glossaries-dutch"
DESCRIPTION = "This package includes the documentation for texlive-glossaries-dutch"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn35685"

RPM_NAME = "texlive-glossaries-dutch-doc-2026.226.1.1svn35685-60.4.noarch.rpm"
RPM_HASH = "07c1bb19e4e70b10e9ec7086f7d29dc7fd33ed9d59b7d25d4c51ea3916faea1fb2b84aa2c61b9c0734c8f5d57582d565adcbc03f81a5ed18b7a25c41333106e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-glossaries-dutch-doc"

RDEPENDS:${PN} += ""

inherit rpm
