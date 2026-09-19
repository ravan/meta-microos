SUMMARY = "Documentation for texlive-powerdot-fuberlin"
DESCRIPTION = "This package includes the documentation for texlive-powerdot-fuberlin"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.02asvn52922"

RPM_NAME = "texlive-powerdot-fuberlin-doc-2026.226.0.0.02asvn52922-59.2.noarch.rpm"
RPM_HASH = "dec067493bda2c771cb5ebd9b354acd2a36d3788b388d8c73c312779cb65de65b90e051a5cefbe3e540554d0da72e80305158f3383729deafe18be18ff283adf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-powerdot-fuberlin-doc"

RDEPENDS:${PN} += ""

inherit rpm
