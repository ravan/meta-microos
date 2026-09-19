SUMMARY = "Documentation for texlive-cascadiamono-otf"
DESCRIPTION = "This package includes the documentation for texlive-cascadiamono-otf"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3svn77682"

RPM_NAME = "texlive-cascadiamono-otf-doc-2026.226.0.0.3svn77682-59.2.noarch.rpm"
RPM_HASH = "e534ed4fd8c7870b94ba973c5b1313c19c2c817035530f517c0b8da382f2f9b0040b0b93403bb8f2f074734ccd6a03955dc79a78dbd1db42cd5e926bed30318d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cascadiamono-otf-doc"

RDEPENDS:${PN} += ""

inherit rpm
