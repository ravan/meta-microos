SUMMARY = "Documentation for texlive-anonchap"
DESCRIPTION = "This package includes the documentation for texlive-anonchap"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1asvn77682"

RPM_NAME = "texlive-anonchap-doc-2026.226.1.1asvn77682-61.2.noarch.rpm"
RPM_HASH = "9ec5085f4da1bc3b82731bcd180a7e4f31b31f32c6ad621007f6bcbff2125e9a6f640d6d8827cf2082cf25fc46bcf003120978536f73ac872713cc1040f0e276"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-anonchap-doc"

RDEPENDS:${PN} += ""

inherit rpm
