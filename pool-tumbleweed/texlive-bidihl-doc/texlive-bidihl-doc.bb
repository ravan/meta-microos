SUMMARY = "Documentation for texlive-bidihl"
DESCRIPTION = "This package includes the documentation for texlive-bidihl"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1csvn77682"

RPM_NAME = "texlive-bidihl-doc-2026.226.0.0.1csvn77682-61.2.noarch.rpm"
RPM_HASH = "508f94a3a4ae9433d8bd5725117fcb0fa98f251a6a81f4d0717c879024ab1ac62a5164a9baaae13c8f6f9c5d0720d74beb802d8f492c03d9818d1f9c659acc44"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bidihl-doc"

RDEPENDS:${PN} += ""

inherit rpm
