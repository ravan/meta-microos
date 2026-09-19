SUMMARY = "Documentation for texlive-pdfcolmk"
DESCRIPTION = "This package includes the documentation for texlive-pdfcolmk"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0svn52912"

RPM_NAME = "texlive-pdfcolmk-doc-2026.226.2.0svn52912-58.2.noarch.rpm"
RPM_HASH = "49d460df9e5315538ec5ea15fcb5d6fadb9ff332936ab22abc58d9b7d11703b8db150fe7bf6aa12e4b971393383fe1c82e721e99c0c029e6f837b1be49d0fcc6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pdfcolmk-doc"

RDEPENDS:${PN} += ""

inherit rpm
