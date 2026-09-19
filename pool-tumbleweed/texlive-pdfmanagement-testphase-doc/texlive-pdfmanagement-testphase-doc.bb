SUMMARY = "Documentation for texlive-pdfmanagement-testphase"
DESCRIPTION = "This package includes the documentation for texlive-pdfmanagement-testphase"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.96ysvn77467"

RPM_NAME = "texlive-pdfmanagement-testphase-doc-2026.226.0.0.96ysvn77467-58.2.noarch.rpm"
RPM_HASH = "9ef3e6baec0989a5827b9836a86993468d528a8b97f980d04b48aee89e8d4ee9e0fc4bb22b8e7813cd1ad6a982e67303f4841441fe2a47b1cb0c10b0fb94db83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pdfmanagement-testphase-doc"

RDEPENDS:${PN} += ""

inherit rpm
