SUMMARY = "Documentation for texlive-lua-check-hyphen"
DESCRIPTION = "This package includes the documentation for texlive-lua-check-hyphen"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.7asvn77682"

RPM_NAME = "texlive-lua-check-hyphen-doc-2026.226.0.0.7asvn77682-59.2.noarch.rpm"
RPM_HASH = "81031e72d3dfce0edc13e153b8a7ce92bc8347402e0002cd4f8cbae8fb32f064b4f2aa5121bb1c99f6ae6725b28e1612668e4920ac5fe21a90bac350ce21137b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lua-check-hyphen-doc"

RDEPENDS:${PN} += ""

inherit rpm
