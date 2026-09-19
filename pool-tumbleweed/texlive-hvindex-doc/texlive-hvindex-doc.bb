SUMMARY = "Documentation for texlive-hvindex"
DESCRIPTION = "This package includes the documentation for texlive-hvindex"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.04asvn77682"

RPM_NAME = "texlive-hvindex-doc-2026.226.0.0.04asvn77682-60.2.noarch.rpm"
RPM_HASH = "fa663fec60e5cea2e608e93bedb3c6448f4de991661a6cb03330fd4971d078fdfac3f602d1dee12ebaa76d1c9d949e8a195021e34826d2e0a494a93bc930f5a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hvindex-doc"

RDEPENDS:${PN} += ""

inherit rpm
