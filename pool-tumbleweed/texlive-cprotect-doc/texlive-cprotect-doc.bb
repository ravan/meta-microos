SUMMARY = "Documentation for texlive-cprotect"
DESCRIPTION = "This package includes the documentation for texlive-cprotect"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0esvn77682"

RPM_NAME = "texlive-cprotect-doc-2026.226.1.0esvn77682-61.2.noarch.rpm"
RPM_HASH = "0b94a1a5eb938a294b9617c0e70d6a019845cbb0a5f6652dfa792283944a8a7587535afcaa0ecb8859d8cbab672907b1a6753697114bd913d173ad5777003161"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cprotect-doc"

RDEPENDS:${PN} += ""

inherit rpm
