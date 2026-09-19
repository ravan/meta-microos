SUMMARY = "Documentation for texlive-longdivision"
DESCRIPTION = "This package includes the documentation for texlive-longdivision"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2.2svn77682"

RPM_NAME = "texlive-longdivision-doc-2026.226.1.2.2svn77682-61.2.noarch.rpm"
RPM_HASH = "7e8e4d9fa040934b77b48146d60850ee32455f5a8eea12e37afb8a331736db32405c1f8157241d3a0a789e4bb6875d9cc2e1d799b187fb28292b424c3c2ef453"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-longdivision-doc"

RDEPENDS:${PN} += ""

inherit rpm
