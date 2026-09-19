SUMMARY = "Documentation for texlive-tocbibind"
DESCRIPTION = "This package includes the documentation for texlive-tocbibind"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.5ksvn77682"

RPM_NAME = "texlive-tocbibind-doc-2026.226.1.5ksvn77682-59.2.noarch.rpm"
RPM_HASH = "4b9b551309aba27ccbef2d67057d6890b420aa02c86560d6d47cd6b914fca36c2c6dff80a182b91b4f51435ceb671195b1c0daf1dd39e19700b9a671f8affff9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tocbibind-doc"

RDEPENDS:${PN} += ""

inherit rpm
