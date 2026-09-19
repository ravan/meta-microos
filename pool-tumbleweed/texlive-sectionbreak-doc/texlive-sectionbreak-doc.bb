SUMMARY = "Documentation for texlive-sectionbreak"
DESCRIPTION = "This package includes the documentation for texlive-sectionbreak"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1dsvn77682"

RPM_NAME = "texlive-sectionbreak-doc-2026.226.0.0.1dsvn77682-60.2.noarch.rpm"
RPM_HASH = "9c6940a5389452cb728f3fdb613a41b0e2c4a6e250c1235499da400fa089cb8fb6da73b5951abe4500bd3b1b81145fa482bb34885a3ed9c3a5f72f3d513c1787"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sectionbreak-doc"

RDEPENDS:${PN} += ""

inherit rpm
