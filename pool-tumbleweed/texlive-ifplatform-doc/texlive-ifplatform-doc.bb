SUMMARY = "Documentation for texlive-ifplatform"
DESCRIPTION = "This package includes the documentation for texlive-ifplatform"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.4asvn77682"

RPM_NAME = "texlive-ifplatform-doc-2026.226.0.0.4asvn77682-60.2.noarch.rpm"
RPM_HASH = "e3386e1fe9952cc341bb836ca2e43bb4c9b1c58edbd4d6c6322624544f2d5c3e9e1d65e3f3299b998eef2d10da9276e69f7071970bd84fa2bf2371aaf6e84a03"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ifplatform-doc"

RDEPENDS:${PN} += ""

inherit rpm
