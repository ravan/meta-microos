SUMMARY = "Documentation for texlive-ocr-b-outline"
DESCRIPTION = "This package includes the documentation for texlive-ocr-b-outline"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn20969"

RPM_NAME = "texlive-ocr-b-outline-doc-2026.226.svn20969-61.2.noarch.rpm"
RPM_HASH = "2b350ab97a12b70ed24e1847c4d92e27c93d20670100090530eb22032b8095f28292fab343fed5008fad0e46c3ff4b68654ca03d8835ba38b368a5674be662c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ocr-b-outline-doc"

RDEPENDS:${PN} += ""

inherit rpm
