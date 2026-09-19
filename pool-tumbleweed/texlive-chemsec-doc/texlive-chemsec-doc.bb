SUMMARY = "Documentation for texlive-chemsec"
DESCRIPTION = "This package includes the documentation for texlive-chemsec"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.12asvn76924"

RPM_NAME = "texlive-chemsec-doc-2026.226.1.12asvn76924-60.2.noarch.rpm"
RPM_HASH = "4111b5bfdd0e6c8f5bcf9d7658053ab4bd6adb7d4425553a4b56ff018c6af2740bcd98627e85bbbb5e54708c89e18f5b7cbf43acac088f553c5663f544f94b67"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-chemsec-doc"

RDEPENDS:${PN} += ""

inherit rpm
