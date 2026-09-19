SUMMARY = "Documentation for texlive-bez123"
DESCRIPTION = "This package includes the documentation for texlive-bez123"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1bsvn77682"

RPM_NAME = "texlive-bez123-doc-2026.226.1.1bsvn77682-61.2.noarch.rpm"
RPM_HASH = "e49ff91171cf7e8f6dd8a71c01ec7acc41145de8cd8f4cead32078eeaf0625923e4fb11643a562355bda60f7c70de6ff6d1faba6cfe8d3fa6619d6d5240069b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bez123-doc"

RDEPENDS:${PN} += ""

inherit rpm
