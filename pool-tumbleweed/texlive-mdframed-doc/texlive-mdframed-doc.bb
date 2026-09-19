SUMMARY = "Documentation for texlive-mdframed"
DESCRIPTION = "This package includes the documentation for texlive-mdframed"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.9bsvn77682"

RPM_NAME = "texlive-mdframed-doc-2026.226.1.9bsvn77682-59.2.noarch.rpm"
RPM_HASH = "fb15f2940315ae51758b97f45af6e823795560851c9970fbe056cda57034451aa523a88b436c594e0bce899a03ef3131948ca7e69ade92bdd74db48dcd5e5b11"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mdframed-doc"

RDEPENDS:${PN} += ""

inherit rpm
