SUMMARY = "Documentation for texlive-cmtiup"
DESCRIPTION = "This package includes the documentation for texlive-cmtiup"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.2svn77050"

RPM_NAME = "texlive-cmtiup-doc-2026.226.2.2svn77050-60.2.noarch.rpm"
RPM_HASH = "e35d39d9245e392fb83737fa2ccc5a4e21d62b7d764c7c8c2083ab461c3ead1bc37d5d20a3a66c9778f9c322b05d63775fe74e213c686ed89557b98615b697cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cmtiup-doc"

RDEPENDS:${PN} += ""

inherit rpm
