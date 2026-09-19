SUMMARY = "Documentation for texlive-begingreek"
DESCRIPTION = "This package includes the documentation for texlive-begingreek"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.7svn63255"

RPM_NAME = "texlive-begingreek-doc-2026.226.1.7svn63255-61.2.noarch.rpm"
RPM_HASH = "4935c7b4d675ee485e46a0dedbf17ea259b072b9e73f27e5b559f26d8c4e8f73913aba17df7b6aa2571c0f82d16d27b10de91cddb6e2c88992e3beac2f510f81"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-begingreek-doc"

RDEPENDS:${PN} += ""

inherit rpm
