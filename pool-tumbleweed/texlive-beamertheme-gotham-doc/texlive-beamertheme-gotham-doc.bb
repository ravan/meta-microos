SUMMARY = "Documentation for texlive-beamertheme-gotham"
DESCRIPTION = "This package includes the documentation for texlive-beamertheme-gotham"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2.4.asvn77201"

RPM_NAME = "texlive-beamertheme-gotham-doc-2026.226.1.2.4.asvn77201-61.2.noarch.rpm"
RPM_HASH = "48ff5883b06a62b81cd4251214518748fec548bf6a5b2dd82c6b43826ba522ed0d08ee314a2c8212885237650a093bec64b192739b3b5350f595d05d66d6b70e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-beamertheme-gotham-doc"

RDEPENDS:${PN} += ""

inherit rpm
