SUMMARY = "Documentation for texlive-pdfpages"
DESCRIPTION = "This package includes the documentation for texlive-pdfpages"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.6gsvn77682"

RPM_NAME = "texlive-pdfpages-doc-2026.226.0.0.6gsvn77682-58.2.noarch.rpm"
RPM_HASH = "13963b8c6db6bfe67499af936950d9b58debd6f24a5c9a83e71e3d9bdb7027270d09d4b6db373102fd547198c1e541392babc927546e32dc07d5e2517b875b78"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pdfpages-doc"

RDEPENDS:${PN} += ""

inherit rpm
