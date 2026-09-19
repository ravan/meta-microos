SUMMARY = "Documentation for texlive-colorinfo"
DESCRIPTION = "This package includes the documentation for texlive-colorinfo"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3csvn15878"

RPM_NAME = "texlive-colorinfo-doc-2026.226.0.0.3csvn15878-60.2.noarch.rpm"
RPM_HASH = "baab5bf2c6ef93939c8d5c8d0434f031250c6f1cdd20b6efbf4baa6d9c36c3679f74cb17713e84a21928738482ccbb15ab67324b94a7ab8c161049099f3e625c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-colorinfo-doc"

RDEPENDS:${PN} += ""

inherit rpm
