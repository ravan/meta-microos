SUMMARY = "Documentation for texlive-bxjalipsum"
DESCRIPTION = "This package includes the documentation for texlive-bxjalipsum"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0asvn67620"

RPM_NAME = "texlive-bxjalipsum-doc-2026.226.1.0asvn67620-59.2.noarch.rpm"
RPM_HASH = "c5748c7e1c966ceb19b7f78126ae0b7b87d594a77d5a99a5dc472fea62352026eaa51a862ae8f45d38cd263a40517da74a676368f961df7848cab38e11b2f4f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bxjalipsum-doc"

RDEPENDS:${PN} += ""

inherit rpm
