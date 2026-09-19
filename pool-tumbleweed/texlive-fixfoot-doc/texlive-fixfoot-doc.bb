SUMMARY = "Documentation for texlive-fixfoot"
DESCRIPTION = "This package includes the documentation for texlive-fixfoot"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3asvn77682"

RPM_NAME = "texlive-fixfoot-doc-2026.226.0.0.3asvn77682-59.2.noarch.rpm"
RPM_HASH = "2888cd84432f8f5917c295b43f133ce0c1d229ec7e70df4f09521c6e0810e6e1ff863029aae53daab0070dd5a94969282b793015335b7943920e494da51906d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fixfoot-doc"

RDEPENDS:${PN} += ""

inherit rpm
