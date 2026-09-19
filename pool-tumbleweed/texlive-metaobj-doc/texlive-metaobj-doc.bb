SUMMARY = "Documentation for texlive-metaobj"
DESCRIPTION = "This package includes the documentation for texlive-metaobj"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.93svn15878"

RPM_NAME = "texlive-metaobj-doc-2026.226.0.0.93svn15878-61.2.noarch.rpm"
RPM_HASH = "51dcd43949179055ce71e902078fd19b1b1a2b6426f7b691f9b43ddedb37f8dde6cb7f35da919c9ff8c46e6ebd16e18e330fcc4f7934574593b7b877e5926a02"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-metaobj-doc"

RDEPENDS:${PN} += ""

inherit rpm
