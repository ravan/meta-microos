SUMMARY = "Documentation for texlive-multilang"
DESCRIPTION = "This package includes the documentation for texlive-multilang"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.9bsvn77682"

RPM_NAME = "texlive-multilang-doc-2026.226.0.0.9bsvn77682-61.2.noarch.rpm"
RPM_HASH = "19459454e873b6e2a8689c65c9cd31df5510831f53baf75ba69515e90409ff2b4f73f3df723a695bde0e4baa77aa076d9bf4412491bfb647d7c015569d6e8d3d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-multilang-doc"

RDEPENDS:${PN} += ""

inherit rpm
