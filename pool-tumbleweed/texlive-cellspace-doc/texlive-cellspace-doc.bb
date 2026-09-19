SUMMARY = "Documentation for texlive-cellspace"
DESCRIPTION = "This package includes the documentation for texlive-cellspace"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.9.1asvn77682"

RPM_NAME = "texlive-cellspace-doc-2026.226.1.9.1asvn77682-59.2.noarch.rpm"
RPM_HASH = "189486991a1f3a769f9f39071dd75720fc891e8e167c9673fa5dbcb49fd9f3eb6f658d34fdb760ff32aaeb25bbc92cc39a9d7dc050d89ce60bae064cc306c9ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cellspace-doc"

RDEPENDS:${PN} += ""

inherit rpm
