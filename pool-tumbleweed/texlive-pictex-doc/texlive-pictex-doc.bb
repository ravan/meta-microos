SUMMARY = "Documentation for texlive-pictex"
DESCRIPTION = "This package includes the documentation for texlive-pictex"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1bsvn59551"

RPM_NAME = "texlive-pictex-doc-2026.226.1.1bsvn59551-58.2.noarch.rpm"
RPM_HASH = "e604940e1854e51c7a5e49da3968ef7c5b407062fa48570a7f91f25b4fe5705a601e5efbda4c20e9b729bc17c7df49c77fdbf7b715776b414140d62e214bc8cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pictex-doc"

RDEPENDS:${PN} += ""

inherit rpm
