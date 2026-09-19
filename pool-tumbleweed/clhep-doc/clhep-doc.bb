SUMMARY = "Documentation for CLHEP"
DESCRIPTION = "This package provides documentation for the CLHEP library."
LICENSE = "GPL-3.0-only | LGPL-3.0-only"

PV = "2.4.7.2"

RPM_NAME = "clhep-doc-2.4.7.2-1.4.noarch.rpm"
RPM_HASH = "93acfc7c56affa9fa9506beffbd067f41ebe302d991e9dc373da25148b8e4043fe0cc5723a3416ea3084e06fa4efc507b9b8871a819ef9687fba52b6feed5eca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "clhep-doc"

RDEPENDS:${PN} += ""

inherit rpm
